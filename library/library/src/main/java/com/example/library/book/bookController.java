package com.example.library.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class bookController {

	@Autowired
	private bookService bookDataService;

	@ApiOperation(value = "Get list of all books")
	@GetMapping("/getAllBooks")
	public List<book> getAllBooks() {

		return bookDataService.getAllBooks();

	}
    
	
	@ApiOperation(value = "Get specific book by using bookId")
	@GetMapping("/getBookById/{id}")
	public Optional<book> getBookById(@PathVariable Integer id) {

		return bookDataService.getSpecificBook(id);

	}
    
	
	@ApiOperation(value = "Add Book")
	@PostMapping("/addBook")
	public void addBook(@RequestBody book b) {
		bookDataService.saveBook(b);
	}
    
	@ApiOperation(value = "Update a Book using book Id and all of its attributes")
	@PostMapping("/updateBook")
	public String updateBook(@RequestBody book b) {
		return bookDataService.updateBook(b);
	}
	
	@ApiOperation(value = "Remove a book by passing its ID")
	@PostMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable Integer id) {
		return bookDataService.deleteBook(id);
	}
	
	@ApiOperation(value = "Get all books by a particular author by passing authorId")
	@GetMapping("/getAllBooksByAuthorId/{id}")
	public List<book> getBookByAuthor(@PathVariable Integer id) {

		return bookDataService.getBooksByAuthor(id);

	}

}
