package com.springmvc.restconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.restconsumer.entity.Book;
import com.springmvc.restconsumer.service.BookConsumService;

@RestController
public class BookController {

	@Autowired
	BookConsumService service;
	
	@GetMapping("/books")
	public ResponseEntity<?> getBooks() {
		System.out.println("Hello");
		
		return ResponseEntity.ok(service.getBooks());
	
	}
}
