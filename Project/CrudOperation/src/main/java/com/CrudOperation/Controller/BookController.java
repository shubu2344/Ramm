package com.CrudOperation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudOperation.Model.Book;
import com.CrudOperation.Repository.BookRepo;

@RestController
public class BookController {

	@Autowired
	BookRepo bookRepo;

	@PostMapping("bookSave")
	public String insertBook(@RequestBody Book  book) {
		bookRepo.save(book);
		return "sucessfull";
	}

}
