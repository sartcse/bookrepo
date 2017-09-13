package com.acc.book.bookrepo.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.book.bookrepo.dataObjects.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
