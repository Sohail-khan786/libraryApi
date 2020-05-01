package com.example.library.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {

	@Autowired
	private bookService bookDataService;

	@GetMapping("/getAllBooks")
	public List<book> getAllBooks() {

		return bookDataService.getAllBooks();

	}

	@GetMapping("/getBookById/{id}")
	public Optional<book> getBookById(@PathVariable Integer id) {

		return bookDataService.getSpecificBook(id);

	}

	@PostMapping("/addBook")
	public void addBook(@RequestBody book b) {
		bookDataService.saveBook(b);
	}

	@PostMapping("/updateBook")
	public String updateBook(@RequestBody book b) {
		return bookDataService.updateBook(b);
	}

	@PostMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable Integer id) {
		return bookDataService.deleteBook(id);
	}

}
