package com.example.library.authors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepo;

	public String addAuthor(Author author) {

		authorRepo.save(author);
		return "Author Added Successfully";
	}

	public String deleteAuthor(Integer id) {

		authorRepo.deleteById(id);
		return "Author Deleted";
	}

	public String updateAuthor(Author author) {

		authorRepo.save(author);
		return "Author Updated Successfully";
	}

	public List<Author> getAllAuthors() {

		return authorRepo.findAll();
	}

}
