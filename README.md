# API Spring Boot com Autenticação JWT

Projeto Java com Spring Boot, implementando autenticação via JWT e controle de acesso baseado em roles (`ADMIN` e `USER`).

##   Descrição

Esta aplicação permite:
- Cadastro de usuários com `nome`, `email`, `senha` e `role`
- Login com geração de token JWT
- Acesso a endpoints protegidos com base na role
- Visualização e edição do perfil pelo próprio usuário
- Controle de usuários por administradores

---

##   Tecnologias Utilizadas

- Java 17
- Spring Boot 3+
- Spring Security
- JWT
- H2 Database (para testes, pode ser substituído por PostgreSQL/MySQL)
- Maven

---

##  Como executar o projeto

### 1. Pré-requisitos

- JDK 17+
- Maven

### 2. Executar

- Abrir com IntelliJ
- Esperar que carregue todas as dependencias
- Rodar JwtApplication

### > A API estará disponível em:  
#### `http://localhost:8080`

### Endpoints para todos
- POST /register - Registra um novo usuario
- POST /login - Fazer login(devolve o token para o restante dos testes)
### 👤 Endpoints para Usuário Autenticado
- GET	/me	 -  Visualiza dados do próprio usuário
- PUT	/me	 -  Atualiza nome e senha do próprio usuário

### 🛡️ Endpoints para Admin
- GET	    /admin/users	-  Lista todos os usuários
- PUT	    /admin/users/{id}	- Edita qualquer usuário
- DELETE	/admin/users/{id}	- Deleta qualquer usuário
