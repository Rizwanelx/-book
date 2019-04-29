package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.domain.Book;

public interface BookService {

	List<Book> findAll();
	
	Book findOne(Long id);
	
	Book save(Book book);
	
	List<Book> blurrySearch(String title);
	
	void removeOne(Long id);
}
