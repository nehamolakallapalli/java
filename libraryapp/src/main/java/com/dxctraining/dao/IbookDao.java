package com.dxctraining.dao;

import com.dxctraining.entities.Book;
import java.util.List;

public interface IbookDao 
{
	public Book findBookId(String id);
	public Book updateBookcost(String id,double cost);
	void bookDetails(Book book);
	void addBook(Book book);
	void removeBook(String id);
	List<Book> findAllBooks();
}