package com.acc.book.bookrepo.dataObjects;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private int id;
	
	
    private String name;
    
//    @OneToMany
//    private List<Books> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Books> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Books> books) {
//		this.books = books;
//	}
}
