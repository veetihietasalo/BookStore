# BookStore

The start of a bookstore web app in Spring Boot. It has a `Book` entity (title, author, publication year, ISBN, price), a Spring Data repository and an in-memory H2 database, and saves 2 placeholder books at startup.

Not finished: the book list page was never built. `bookStore.html` is empty and `BookController` is a `@RestController`, so it doesn't render a template.

Stack: Java 17, Spring Boot 3.1.3, Spring Data JPA, H2, Maven wrapper.

Run:

```
sh mvnw spring-boot:run      # macOS / Linux
mvnw.cmd spring-boot:run     # Windows
```

Port 8080 (Spring Boot default). The H2 console is on at `/h2-console`, JDBC URL `jdbc:h2:mem:testdb`.

Status: back-end course exercise, 2 commits on 6 and 7 September 2023.
