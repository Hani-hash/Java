package com.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.models.Book;
import com.mvc.repositories.bookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final bookRepository BookRepository;

	public BookService(bookRepository bookRepository) {
		this.BookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return BookRepository.findAll();
	}
	// creates a book

	public Book createBook(Book b) {
		return BookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = BookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	public Book updateBook(Long id, String title, String desc, String lang, int pages) {
		if (findBook(id) != null) {
			Book Hell = findBook(id);
			Hell.setTitle(title);
			Hell.setDescription(desc);
			Hell.setLanguage(lang);
			Hell.setNumberOfPages(pages);
			BookRepository.save(Hell);
			return Hell;
		}
		return null;
	}
	public Book deleteBook(Long id) {
		BookRepository.deleteById(id);
		return null;
		}
	}

