# enoca-project

## Project Overview

Enoca project has two entity classes: Company and Employee. It also includes Dtos of those classes. We can access them from <code>'localhost:8080/api/'</code> . We have 7 endpoint belongs to this service.

| Method Type | Route | Parameters | Response | Description |
| ----------- | --------------------------------- | ------------------------- | ----------------------- |----------------------------------------------------- |
| POST | **/add** | RequestBody, AddEmployeeDto | None | Adds employee. |
| PUT | **/update** | RequestBody, EmployeeShowDto | None | Updates employee. |
| DELETE | **/delete/{employeeId}** | PathVariable, long employeeId | None | Deletes employee. |
| GET | **/findEmployee/{employeeId}** | PathVariable, long employeeId | EmployeeShowDto | Returns the desired employee.
| GET | **/findAllEmployee** | None | List\<EmployeeShowDto> | Returns all employees.
| GET | **/findAllCompany** | None | List\<CompanyDto> | Returns all companies.
| GET | **/findCompanyById/{companyId}** | PathVariable, long companyId | CompanyDto | Returns the desired company.

### Tests

**Database**

The database was created with "PostgreSQL".

<p align="center">
 <img src="enoca-ss/Database.png">
</p> 

**Database Tables**

| company                                           | employee                                        |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/DatabaseCompanies.png) | ![](enoca-ss/DatabaseEmployee.png) |

**localhost:8080/api/add**

| request                                          | request-2                                       |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/EmployeeAdd.png) | ![](enoca-ss/EmployeeAdd2.png) |

| request-3                                          | request-4                                       |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/EmployeeAdd3.png) | ![](enoca-ss/EmployeeAdd4.png) |


| request-5                                          | database                                      |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/EmployeeAdd5.png) | ![](enoca-ss/EmployeeAddDatabase.png) |

**localhost:8080/api/update**

| request                                          | database                                      |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/EmployeeUpdate.png) | ![](enoca-ss/EmployeeUpdateDatabase.png) |

**localhost:8080/api/delete/{employeeId}**

| request                                          | database                                      |
| ---------------------------------------------------- | ------------------------------------------------- |
| ![](enoca-ss/EmployeeDelete.png) | ![](enoca-ss/EmployeeDeleteDatabase.png) |

**localhost:8080/api/findEmployee/{employeeId}**

| request-response                                     |
| ----------------------------------------------------------------------------------------------------- |
| ![](enoca-ss/EmployeeFindById.png)  |

**localhost:8080/api/findAllEmployee**

| request-response                                     |
| ----------------------------------------------------------------------------------------------------- |
| ![](enoca-ss/EmployeeFindAll.png)  |

**localhost:8080/api/findAllCompany**

| request-response                                     |
| ----------------------------------------------------------------------------------------------------- |
| ![](enoca-ss/CompanyFindAll.png)  |

**localhost:8080/api/findCompanyById/{companyId}**

| request-response                                     |
| ----------------------------------------------------------------------------------------------------- |
| ![](enoca-ss/CompanyFindById.png)  |
