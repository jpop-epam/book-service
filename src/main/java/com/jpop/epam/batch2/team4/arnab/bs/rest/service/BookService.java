package com.jpop.epam.batch2.team4.arnab.bs.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpop.epam.batch2.team4.arnab.bs.rest.model.Book;
import com.jpop.epam.common.service.exception.NotImplementedException;

@Service
public class BookService {

	public List<Book> getAllBooks() {
		throw new NotImplementedException();
	}

	public Book getBookById(String bookId) {
		throw new NotImplementedException();
	}

	public Book addBook(Book book) {
		throw new NotImplementedException();
	}

	public void deleteBook(String bookId) {
		throw new NotImplementedException();
	}

	public Book updateBook(String bookId, Book book) {
		throw new NotImplementedException();
	}

	public List<Book> uploadBooksFromCSV() {
		throw new NotImplementedException();
	}
}
