package com.acc.book.bookrepo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.book.bookrepo.dataObjects.Author;
import com.acc.book.bookrepo.datarepository.AuthorRepository;
import com.acc.book.bookrepo.datarepository.BooksRepository;


@RestController
@EnableAutoConfiguration
@RequestMapping(value ="/authors")
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BooksRepository booksRepository;
	
	@GetMapping(value = "/sample")
	public String sample(){
		return "rest service";
	}
	
	@GetMapping(value = "/all")
	public List<Author> findAllAuthors(){
		return authorRepository.findAll();
	}
	@GetMapping(value= "/{id}")
	public Author findAuthoryByID(@PathVariable final String id) {
		return authorRepository.findOne(Integer.parseInt(id));
	}
	
	@PostMapping(value= "/{name}")
	public String createOrUpdateAuthor(@PathVariable final String name) {
		Author author = new Author();
		author.setName(name);
		authorRepository.save(author);
		return "Success";
	}
}