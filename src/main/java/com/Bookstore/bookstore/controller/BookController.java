package com.Bookstore.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/index") 
	public String index() {
		System.out.println("index");
		return "index";
	}
		
}
