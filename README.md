# CarFactory
Car factory Spring Boot project

## How to run
Run the command below at the root directory of this project to start Spring Boot application.  
`.\mvnw spring-boot:run`

## How to call
Send a POST request to the endpoint `http://localhost:8080/produce`  
with a request parameter named `carType`  
which can be one of 'cabrio', 'sedan', 'hatchback'.  
Otherwise it returns an error message indicating that supplied carType is of unknown type.

You can import and use the postman collection located in `src/main/resources/CarFactory.postman_collection.json`