package com.Bookstore.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bookstore.bookstore.model.BookRepository;

@RestController
public class BookController {
@Autowired
private BookRepository repository;

	@RequestMapping(value= {"/", "/bookStore"})
	public String bookStore(Model model) {
		model.addAttribute("books", repository.findAll());
		return "books";
	}

	@GetMapping("/index") 
	public String index() {
		System.out.println("index");
		return "index";
	}
		
}
