package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Fixed monthly rent amount
        val unitRent = 30000

        // ==================== VIEW REFERENCES ====================
        val tenantNameEditText = findViewById<EditText>(R.id.EditTenantName)
        val phoneEditText = findViewById<EditText>(R.id.EditPhoneNo)
        val rentEditText = findViewById<EditText>(R.id.EditRentPaid)
        val displayTextView = findViewById<TextView>(R.id.textViewDisplay)
        val buttonDisplayInfo = findViewById<Button>(R.id.ButtonDisplayInfo)

        // ==================== BUTTON CLICK LISTENER ====================
        buttonDisplayInfo.setOnClickListener {

            // Read input values as strings
            val name = tenantNameEditText.text.toString()
            val phone = phoneEditText.text.toString()

            // Null-safe read of rent input, defaulting to empty string
            val rentString = rentEditText.text?.toString() ?: ""

            // Convert rent string to Int safely (0 if empty or invalid)
            val rent = rentString.toIntOrNull() ?: 0

            // Calculate the balance owed
            val balance = unitRent - rent

            // Display all details in the output TextView
            displayTextView.text = """
                This Tenant is
                Tenant: $name
                Phone: $phone
                Rent: $rent
                Balance: $balance
            """.trimIndent()
        }
    }
}