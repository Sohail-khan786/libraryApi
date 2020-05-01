package com.example.library.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String name;
	private String author;
	private Integer authorId;

	public book() {
		// TODO Auto-generated constructor stub
		this.bookId = 0;
		this.name = "default";
		this.author = "default";
		this.authorId = 0;
	}

	public book(Integer bookId, String name, String author, Integer authorId) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.authorId = authorId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
