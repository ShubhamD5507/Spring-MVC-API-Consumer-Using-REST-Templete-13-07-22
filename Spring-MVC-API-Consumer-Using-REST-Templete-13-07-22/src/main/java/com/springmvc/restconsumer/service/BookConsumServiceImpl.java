package com.springmvc.restconsumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springmvc.restconsumer.entity.Book;
@Service
public class BookConsumServiceImpl implements BookConsumService {

	@Autowired
	RestTemplate template;
	
	@Override
	public ResponseEntity<?> getBooks() {
		
		String url = "http://localhost:8085/Spring-MVC-REST-CRUD-API-11-07/books/105";
		
		ResponseEntity<Book> book = template.getForEntity(url, Book.class);
		
		return book;
	}
}
