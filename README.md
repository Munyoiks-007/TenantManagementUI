# Tenant Management System
An Android app for landlords to record tenants, see total rent, and call tenants.
## Download
Latest APK: see **Releases** on the right of this page.
## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer
## Architecture
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room
## Team
| Stage | Member          | Admission No. | Pull request                                        |
|---|-----------------|---------------|-----------------------------------------------------|
| 1 Lead | Ian Charles Munyoike | 189540        | (link)                                              |
| 2 ViewModel | Lynn Dede       | 185182        | https://github.com/Munyoiks-007/TenantManagementUI/pull/1 |
| 3 Room | Bruce Mayiani   | 192988        | https://github.com/Munyoiks-007/TenantManagementUI/pull/2 |
| 4 Screens | Davis Sheth     | 188970        | https://github.com/Munyoiks-007/TenantManagementUI/pull/3                                                    |
| 5 Data integration | Patience Rifera | 186181        | https://github.com/Munyoiks-007/TenantManagementUI/pull/4                                                    |
| 6 Release | George Tevin Muigai | 191326        | (link)                                              |