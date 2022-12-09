# enoca-project

## Project Overview

Enoca project has two entity classes: Company and Employee. It also includes Dtos of those classes. We can access them from <code>localhost:8081/api/'</code> . We have 4 endpoint belongs to this service.

| Method Type | Route | Parameters | Response | Description |
| ----------- | --------------------------------- | ------------------------- | ----------------------- |----------------------------------------------------- |
| POST | **/add** | None | List\<CategoryDto> | Return category list which shows all categories. |
| PUT | **/update** | Path variable, String category_name|\<CategoryDto> | Adds category to inventory.|
| DELETE | **/api/delete/{employeeId}** | Path variable, Long category_id| List\<ProductDto> | Returns categories under given category|
| GET | **/api/findEmployee/{employeeId}** | Path variable, Long product_id | ProductDto| return the requested product object.
| GET | **/api/findAllEmployee** | Path variable, Long product_id | ProductDto| return the requested product object.
| GET | **/product/{product_id}** | Path variable, Long product_id | ProductDto| return the requested product object.
| GET | **/product/{product_id}** | Path variable, Long product_id | ProductDto| return the requested product object.
