package com.fzs.lproj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fzs.lproj.model.Book;

public interface BookRepo extends MongoRepository<Book, Integer> {

}
