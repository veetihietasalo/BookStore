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
			repository.save(new Book( "Book1", "ISBN1", 0, null, 0, null));
			repository.save(new Book( "Book2", "ISBN2", 0, null, 0, null));

		};
		
	}

}
