package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Book;

public interface BookService {
	
	public Book save(Book save);
	
	List<Book> findAll();
	
	Book findOne(Long id);

	void removeOne(Long id);
}
