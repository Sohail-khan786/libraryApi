package com.example.library.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {

	@Autowired
	private bookRepository bookRepo;

	public void saveBook(book b) {
		bookRepo.save(b);
	}

	public List<book> getAllBooks() {

		return bookRepo.findAll();

	}

	public String deleteBook(Integer id) {
		bookRepo.deleteById(id);
		return "book is deleted";
	}

	public String updateBook(book b) {
		bookRepo.save(b);
		return "bookIsUpdated";
	}
	
	public Optional<book> getSpecificBook(Integer id) {
		return bookRepo.findById(id);
	}

}
