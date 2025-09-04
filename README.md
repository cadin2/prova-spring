# Lead API: Semana Nacional de Ciência e Tecnologia

Este projeto é uma API RESTful completa, desenvolvida com **Spring Boot** para o cadastro de leads da Semana Nacional de Ciência e Tecnologia (SNCT). O projeto foi concebido para aplicar e consolidar os conhecimentos em **Teste de Software**, **Implementação de Sistemas** e **Modelagem de Sistemas**, seguindo os padrões REST.

---

### 💻 Tecnologias

<table>
  <tr>
    <td align="center">
      <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
      <br />Java
    </td>
    <td align="center">
      <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot" />
      <br />Spring Boot
    </td>
    <td align="center">
      <img src="https://img.shields.io/badge/Flyway-CC0000?style=for-the-badge&logo=flywaydb&logoColor=white" alt="Flyway" />
      <br />Flyway
    </td>
    <td align="center">
      <img src="https://img.shields.io/badge/JPA-4479A1?style=for-the-badge&logo=jpa&logoColor=white" alt="JPA" />
      <br />JPA
    </td>
    <td align="center">
      <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" alt="Hibernate" />
      <br />Hibernate
    </td>
    <td align="center">
      <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL" />
      <br />MySQL
    </td>
  </tr>
</table>

---

### 🚀 Como Executar o Projeto

Siga os passos abaixo para clonar e rodar o projeto em sua máquina local.

#### **Pré-requisitos**

Certifique-se de que você tem os seguintes softwares instalados:

* **Java Development Kit (JDK) 17 ou superior**
* **MySQL 8.0 ou superior**
* **Maven**
* **Git**

## **Clonar o Repositório**

``` bash
git clone https://github.com/Lucast34/prova-spring.git
cd prova-spring
```

## **Configurar o Banco de Dados**

> Crie um banco de dados vazio no MySQL chamado ```lead_api_db.```

Abra o arquivo ```src/main/resources/application.properties``` e atualize as credenciais do seu banco de dados:

``` Properties
# Database connection settings
spring.datasource.url=jdbc:mysql://localhost:3306/lead_api_db
spring.datasource.username=seu_usuario_mysql
spring.datasource.password=sua_senha_mysql
```

O Flyway irá se encarregar de criar as tabelas e migrações necessárias automaticamente quando a aplicação for iniciada.

## **Executar a Aplicação**

### Você pode executar a API usando sua IDE ou a linha de comando.

### Via Linha de Comando

``` bash
# Navegue até a pasta raiz do projeto
./mvnw spring-boot:run
```

### Via IDE (IntelliJ, VS Code, etc.)

1. Importe o projeto como um projeto Maven.

2. Localize a classe principal ```LeadApiApplication.java``` (geralmente em ```src/main/java/.../LeadApiApplication.java```).

3. Execute o método main da classe.

## Endpoints da API

> Após a aplicação ser iniciada, a API estará disponível em ```http://localhost:8080.```

|Método|Endpoint|Descrição|
|-|-|-|
|POST|/leads|Cadastra um novo lead.|
|GET|/leads|Lista todos os leads.|
|GET|/leads/{id}|Busca um lead por ID.|
|PUT|/leads/{id}|Atualiza um lead existente.|
|DELETE|/leads/{id}|Deleta um lead.|

Exemplo de requisição para cadastro de lead:

``` json

//POST http://localhost:8080/leads
//Content-Type: application/json

{
  "nome": "João da Silva",
  "email": "joao.silva@example.com",
  "telefone": "11999999999"
}
```

## Orientação

Este projeto foi desenvolvido sob a orientação do professor Rômulo C. Silvestre nas disciplinas de Teste de Software, Implementação de Sistemas e Modelagem de Sistemas no SENA
