package com.web.bs.service;

import java.util.List;

import com.web.bs.model.Book;

/**
 * 
 * @author Ashok
 *
 */
public interface BookService {

	public boolean insert(Book book);

	public List<Book> findAllBooks();

	public boolean delete(Integer bid);

	public Book edit(Integer bid);

	public boolean update(Book b);
	
	public List<Book> findByIsbn(String isbn);

}


