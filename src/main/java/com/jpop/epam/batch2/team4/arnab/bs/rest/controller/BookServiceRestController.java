package com.jpop.epam.batch2.team4.arnab.bs.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpop.epam.batch2.team4.arnab.bs.rest.model.Book;
import com.jpop.epam.batch2.team4.arnab.bs.rest.service.BookService;

@RestController
public class BookServiceRestController {
	private BookService bookService;

	public BookServiceRestController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@GetMapping(value = "/books/{bookId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getBookById(@PathVariable("bookId") String bookId) {
		return new ResponseEntity<>(bookService.getBookById(bookId), HttpStatus.OK);
	}

	@PostMapping(value = "/books/{bookId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> addBook(@PathVariable("bookId") String bookId, @RequestBody Book book) {
		return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/books/{bookId}")
	public ResponseEntity<Object> deleteBook(@PathVariable("bookId") String bookId) {
		bookService.deleteBook(bookId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(value = "/books/{bookId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> updateBook(@PathVariable("bookId") String bookId, @RequestBody Book book) {
		return new ResponseEntity<>(bookService.updateBook(bookId, book), HttpStatus.OK);
	}

	@PostMapping(value = "/books/upload", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> uploadBooksFromCSV() {
		return new ResponseEntity<>(bookService.uploadBooksFromCSV(), HttpStatus.CREATED);
	}
}
