package com.acc.book.bookrepo.datarepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.book.bookrepo.dataObjects.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	
}
