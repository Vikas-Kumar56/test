package com.sb.spring.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.spring.bookstore.dto.BookDTO;

@RestController
@RequestMapping("/api")
public class BookController {

	@GetMapping("/books")
	public ResponseEntity<List<BookDTO>> books() {
		BookDTO book = BookDTO.builder().title("Sample Book").build();
		List<BookDTO> books = new ArrayList<BookDTO>();
		books.add(book);
		return ResponseEntity.ok(books);
	}
}
