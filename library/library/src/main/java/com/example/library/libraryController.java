package com.example.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {
	@GetMapping(value="/")
	public String HomePage() {
		return "Hello , Please Use proper endpoints";
	}

}
