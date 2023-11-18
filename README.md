# BackEnd PicPay Challenge

This is a RESTful system developed in Spring Boot to handle functionalities as proposed in the PicPay challenge.
The challenge can be viewed at: https://github.com/PicPay/picpay-desafio-backend.

## Main Features

- User registration with validation of unique CPF/CNPJ and email in the system.
- Money transfer between users and merchants.
- Checking account balance before transfer to validate if the user has sufficient funds.
- Query to an external authorization service before finalizing the transfer.
- Notification via email or SMS upon receiving payment. (Still in Testing)

## Requirements

- Java 17
- Maven
- Spring Boot 3.1.5

## Dependencies

- `spring-boot-starter-data-jpa`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `h2database`
- `lombok`
- `spring-boot-starter-test`

## Running the Project

To run the project locally, you can follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/juliocmarinho/PicPayChallenge.git
cd PicPayChallenge
```

2. Compile and run the project using Maven:

```bash
mvn spring-boot:run
```

3. The server will be accessible at [http://localhost:8080](http://localhost:8080).

## Project Structure

The project follows the following structure:

- `src/main/java/com.picpaysimplificado.picpaysimplificado`: Main package of the project.
  - `controllers`: REST Controllers.
  - `dtos`: Data Transfer Objects for data transfer.
  - `entities`: System entities.
  - `repositories`: JPA Repository Interfaces.
  - `services`: Business logic and services.
  - `infra`: Infrastructure package.
    - `AppConfig`: Spring Boot configuration, including restTemplate.
    - `ControllerExceptionHandler`: Exception handler.
  
- `src/main/resources`: Project resources.
  - `application.properties`: Spring Boot configurations.

## License

This project is licensed under the [MIT License](LICENSE).
