package com.example.library.authors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    
	@Autowired
	private AuthorService authorDataService;

	@GetMapping("/getAllAuthors")
	public List<Author> getAllAuthors() {

		return authorDataService.getAllAuthors();

	}

	@PostMapping("/addAuthor")
	public String addAuthor(@RequestBody Author author) {
		return authorDataService.addAuthor(author);
		//return "added";
	}

	@PostMapping("/deleteAuthor/{id}")
	public String removeAuthor(@PathVariable Integer id) {
		return authorDataService.deleteAuthor(id);
		//return "deleted";
	}
	
	@PostMapping("/updateAuthor")
	public String updateAuthor(@RequestBody Author author) {
		return authorDataService.addAuthor(author);
		//return "updated";
	}

}
