package org.dxctraining.book.dao;

import org.dxctraining.book.entities.Book;
import java.util.List;

public interface IbookDao 
{
	public Book findBookId(String id);
    void addBook(Book book);
    void removeBook(String id);
    public List<Book>showBooks();
}