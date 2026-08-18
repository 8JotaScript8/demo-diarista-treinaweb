# 🏠 Diaristas App

Projeto de estudo desenvolvido com **Spring Boot** e **Thymeleaf** para gerenciamento de profissionais de limpeza (diaristas).

## 📋 Sobre

Esta aplicação foi criada como projeto de aprendizado para estudar os fundamentos do Spring Boot, incluindo:

- Spring MVC com Thymeleaf
- Spring Data JPA com MySQL
- CRUD completo (Create, Read, Update, Delete)
- Arquitetura em camadas (Controller, Repository, Model, DTO)

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4.1.0**
- **Spring Data JPA**
- **Thymeleaf** (Template Engine)
- **MySQL** (Banco de Dados)
- **Bootstrap 5.3** (Frontend)
- **Maven** (Build Tool)

## 📁 Estrutura do Projeto

```
src/main/java/br/com/treinaweb/demo/
├── controllers/
│   ├── DiaristaController.java    # Controller para CRUD de diaristas
│   └── HomeController.java        # Controller da página inicial
├── dto/
│   └── DiaristaForm.java          # DTO para formulário de cadastro
├── models/
│   └── Diarista.java              # Entidade JPA
├── repositories/
│   └── DiaristaRepository.java    # Interface de acesso a dados
└── DemoApplication.java           # Classe principal

src/main/resources/
├── templates/
│   ├── home.html                  # Página inicial
│   ├── form.html                  # Formulário de cadastro
│   ├── listar-diaristas.html      # Lista de diaristas
│   └── detalhes-diarista.html     # Detalhes de uma diarista
└── application.properties         # Configurações da aplicação
```

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven
- MySQL Server

### Configuração do Banco de Dados

1. Crie um banco de dados chamado `demo` no MySQL:

```sql
CREATE DATABASE demo;
```

2. Atualize as configurações no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root123
```

### Executando a Aplicação

```bash
# Via Maven
./mvnw spring-boot:run

# Ou Windows
mvnw.cmd spring-boot:run
```

A aplicação estará disponível em: **http://localhost:8080**

## 📖 Funcionalidades

- ✅ Listar todas as diaristas cadastradas
- ✅ Visualizar detalhes de uma diarista
- ✅ Cadastrar novas diaristas
- ✅ Interface responsiva com Bootstrap

## 🗄️ Modelo de Dados

### Diarista

| Campo     | Tipo    | Descrição          |
|-----------|---------|-------------------|
| id        | Long    | Identificador único |
| nome      | String  | Nome completo      |
| cpf       | String  | CPF (11 dígitos)   |
| telefone  | String  | Telefone           |
| endereco  | String  | Endereço (opcional)|

## 📚 Referências

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Thymeleaf Documentation](https://www.thymeleaf.org/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Bootstrap Documentation](https://getbootstrap.com/)

## 👨‍💻 Autor

Projeto de estudo baseado nos cursos da **TreinaWeb**.

## 📝 Licença

Este é um projeto de estudo. Sinta-se à vontade para usá-lo como referência para seus próprios projetos.
