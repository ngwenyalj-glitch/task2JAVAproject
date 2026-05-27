# Project 2: FirstRestAPI (Backend Architecture & In-Memory Database)

**Author:** Lethukuthula Jubilant Ngwenya  
**Student ID:** 74960  
**University:** Vistula University  
**Course:** Java Programming  
**Assignment:** Task 2 (REST API Framework Implementation)

---

## Project Description
This is a pure backend REST API application built from scratch using the Spring Boot framework inside IntelliJ IDEA via Spring Initializr. The application completely decouples backend business layers from any user interface (frontend components), utilizing structured JSON data formats to exchange information with clients via specific HTTP methods. 

The primary objective of this project is to implement core Spring stereotype configurations and transition our application from using a temporary in-memory `HashMap` to a persistent runtime H2 relational database using Spring Data JPA and Hibernate.

-



## How to Run the Application
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Reload the Maven dependencies from the `pom.xml`.
4. Run the main class
5. The application will start on Tomcat port `8080`.



## Database Configuration
The application uses a lightweight H2 database that stores data in memory during runtime.
* **H2 Console URL:** `http://localhost:8080/console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **Username:** `sa`
* **Password:** *(leave blank)*

<img width="2256" height="1443" alt="screenshot (315)" src="https://github.com/user-attachments/assets/0ba88e41-5b50-4b61-8863-f18f819859d0" />
<img width="2256" height="1454" alt="screenshot (314)" src="https://github.com/user-attachments/assets/382d8091-972c-471a-b8d7-1e3d3815a9e8" />

*Successful connection to the H2 Database console.*


*View of the `PRODUCTS` table after inserting and updating a record.*

## API Endpoints and Use Cases
The API is documented and fully testable via Swagger UI.
* **Swagger UI URL:** `http://localhost:8080/swagger-ui/index.html`

![Swagger UI Overview](images/screenshot(316).png)
*Main Swagger UI page displaying all available endpoints.*

### 1. Create a Product (`POST /api/v1/products`)
Creates a new product in the database.
* **Success Response:** `201 CREATED`

![POST Request](images/screenshot(317).png)


*Successful POST request creating "My First Vistula Product".*

### 2. Find All Products (`GET /api/v1/products`)
Retrieves a list of all products currently stored in the database.
* **Success Response:** `200 OK` (Returns an array of Product JSON objects)

![GET All Request](images/screenshot(318).png)
*Successful GET request retrieving all products.*

### 3. Find Product by ID (`GET /api/v1/products/{id}`)
Retrieves a specific product by its unique ID.
* **Success Response:** `200 OK`

![GET by ID Request](images/screenshot(319).png)
*Successful GET request retrieving a product by its ID.*


### 4. Update a Product (`PUT /api/v1/products/{id}`)
Updates the details of an existing product.
* **Success Response:** `200 OK`

![PUT Request](images/screenshot(320).png)
*Successful PUT request updating the product name to "Updated Vistula Product".*

### 5. Delete a Product (`DELETE /api/v1/products/{id}`)
Removes a product from the database.
* **Success Response:** `204 NO CONTENT`

![DELETE Request](images/screenshot(321).png)
*Successful DELETE request removing a product from the database.




### Codebase Package Structural Tree
```text
pl.edu.vistula.lethukuthula
│
└── product/
     ├── api/
     │    ├── request/       <-- ProductRequest.java & UpdateProductRequest.java
     │    ├── response/      <-- ProductResponse.java
     │    └── ProductController.java
     │
     ├── domain/             <-- Product.java (Data entity schema mapped with @Entity)
     ├── repository/         <-- ProductRepository.java (Extends JpaRepository)
     ├── service/            <-- ProductService.java
     └── support/            
          ├── exception/     <-- ProductNotFoundException.java
          ├── ProductControllerAdvice.java (Handles @ControllerAdvice exception trapping)
          ├── ProductExceptionSupplier.java
          └── ProductMapper.java






