package com.example.library.authors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer authorId;

	private String name;
	private String city;
	private String country;

	public Author() {
		this.authorId = 0;
		this.name = "default";
		this.country = "default";
		this.country = "default";
	}

	public Author(Integer authorId, String name, String city, String country) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
