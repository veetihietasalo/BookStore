package com.Bookstore.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Bookstore.bookstore.model.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repository;

	@GetMapping({ "/", "/bookStore" })
	public String bookStore(Model model) {
		model.addAttribute("books", repository.findAll());
		return "bookStore";
	}

}
