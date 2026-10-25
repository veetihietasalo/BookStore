package com.Bookstore.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Bookstore.bookstore.model.Book;
import com.Bookstore.bookstore.model.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner book(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Book1", "Author1", 2023, "ISBN1", 19.90));
			repository.save(new Book("Book2", "Author2", 2023, "ISBN2", 24.90));
		};
	}

}
