# enoca-project

## Project Overview

Enoca project has two entity classes: Company and Employee. It also includes Dtos of those classes. We can access them from <code>'localhost:8080/api/'</code> . We have 7 endpoint belongs to this service.

| Method Type | Route | Parameters | Response | Description |
| ----------- | --------------------------------- | ------------------------- | ----------------------- |----------------------------------------------------- |
| POST | **/add** | RequestBody, AddEmployeeDto | None | Adds employee. |
| PUT | **/update** | RequestBody, EmployeeShowDto | None | Updates employee. |
| DELETE | **/api/delete/{employeeId}** | PathVariable, long employeeId | None | Deletes employee. |
| GET | **/api/findEmployee/{employeeId}** | PathVariable, long employeeId | EmployeeShowDto | Returns the desired employee.
| GET | **/api/findAllEmployee** | None | List\<EmployeeShowDto> | Returns all employees.
| GET | **/api/findAllCompany** | None | List\<CompanyDto> | Returns all companies.
| GET | **/api/findCompanyById/{companyId}** | PathVariable, long companyId | CompanyDto | Returns the desired company.

### Tests
