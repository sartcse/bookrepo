package com.acc.book.bookrepo.dataObjects;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Books {
	
	@Id
	@GeneratedValue
	private int id;
	
	
    private String name;
    
    
//    @ManyToOne
//    private List<Author> author;
    
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

//	public List<Author> getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(List<Author> author) {
//		this.author = author;
//	}

	
}
