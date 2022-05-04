package com.fzs.lproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fzs.lproj.model.Book;
import com.fzs.lproj.repo.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Added Successfully";
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeBook(@PathVariable int id) {
		bookRepo.deleteById(id);
		return "Deleted Successfully";
	}
}
