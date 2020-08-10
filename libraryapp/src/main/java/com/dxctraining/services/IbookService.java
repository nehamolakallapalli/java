package com.dxctraining.services;

import com.dxctraining.entities.Book;
import java.util.List;

public interface IbookService 
{
	        Book findBookId(String id);
	        Book updateBookcost(String id,double cost);
	        void removeBook(String id);
	        void addBook(Book book);
	        void bookDetails(Book book);
	        List<Book> findAllBooks();
}
