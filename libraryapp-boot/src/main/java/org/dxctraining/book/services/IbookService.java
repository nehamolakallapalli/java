package org.dxctraining.book.services;

import org.dxctraining.book.entities.Book;
import java.util.List;

public interface IbookService 
{
	   public Book findBookId(String id);
	   public void removeBook(String id);
	   public void addBook(Book book);
	   public List<Book> showBooks();
}
