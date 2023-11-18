# BackEnd PicPay Challenge

Este é um sistema RESTful desenvolvido em Spring Boot para lidar com as funcionalidades do desafio proposto pelo PicPay.
O desafio pode ser visto em: https://github.com/PicPay/picpay-desafio-backend.

## Funcionalidades Principais

- Cadastro de usuários com validação de CPF/CNPJ e e-mail únicos no sistema.
- Transferência de dinheiro entre usuários e lojistas.
- Consulta de saldo antes da transferência para validar se o usuário possui fundos suficientes.
- Consulta a um serviço autorizador externo antes de finalizar a transferência.
- Notificação por e-mail ou SMS no recebimento de pagamento. (Ainda em Testes)

## Requisitos

- Java 17
- Maven
- Spring Boot 3.1.5

## Dependências

- `spring-boot-starter-data-jpa`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `h2database`
- `lombok`
- `spring-boot-starter-test`

## Execução do Projeto

Para executar o projeto localmente, você pode seguir estas etapas:

1. Clone o repositório:

```bash
git clone https://github.com/juliocmarinho/PicPayChallenge.git
cd PicPayChallenge
```

2. Compile e execute o projeto usando o Maven:

```bash
mvn spring-boot:run
```

3. O servidor estará acessível em [http://localhost:8080](http://localhost:8080).

## Estrutura do Projeto

O projeto segue a seguinte estrutura:

- `src/main/java/com.picpaysimplificado.picpaysimplificado`: Pacote principal do projeto.
  - `controllers`: Controladores REST.
  - `dtos`: DTOs para transferência de dados.
  - `entities`: Entidades do sistema.
  - `repositories`: Interfaces de Repositórios JPA.
  - `services`: Lógica de negócios e serviços.
  - `infra`: Pacote de infraestrutura.
    - `AppConfig`: Configuração do Spring Boot, incluindo o restTemplate.
    - `ControllerExceptionHandler`: Handler de exceções.
  
- `src/main/resources`: Recursos do projeto.
  - `application.properties`: Configurações do Spring Boot.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou uma issue para discutir possíveis melhorias ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
