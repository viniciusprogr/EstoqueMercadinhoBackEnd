

### 🚀 Visão Geral

Back-end de controle de estoque de um mercadinho, desenvolvido em Java com Spring Boot, que permite cadastrar produtos, registrar entradas/saídas e consultar níveis de estoque.

### ⚙️ Tecnologias

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **Maven**
* **PostgreSQL** (ou outro SGBD)
* **Docker** (opcional)

### 📘 Endpoints Principais

| Método | Caminho              | Descrição                         |
| ------ | -------------------- | --------------------------------- |
| GET    | `/api/produtos`      | Lista todos os produtos           |
| POST   | `/api/produtos`      | Cadastra novo produto             |
| PUT    | `/api/produtos/{id}` | Atualiza dados de um produto      |
| DELETE | `/api/produtos/{id}` | Remove um produto                 |
| POST   | `/api/movimentos`    | Registra entrada/saída de estoque |
| GET    | `/api/movimentos`    | Lista movimentos de estoque       |



### Autor

Vinicius de Santana Rodrigues

Vnsrodrigues10@gmail.com

https://www.linkedin.com/in/vinicius-de-santana-rodrigues-709570207/
