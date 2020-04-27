package com.example.library.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	

	@GetMapping(value="/test")
	public String getBooks() {
		return "test Works";
	}

}
