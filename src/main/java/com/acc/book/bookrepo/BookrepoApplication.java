package com.acc.book.bookrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.acc.book.bookrepo.*")
@EntityScan("com.acc.book.bookrepo.*")
public class BookrepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrepoApplication.class, args);
	}
}
