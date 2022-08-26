package com.springmvc.restconsumer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springmvc.restconsumer.entity.Book;

public interface BookConsumService {

	public ResponseEntity<?> getBooks();
}
