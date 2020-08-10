package com.dxctraining.dao;

import com.dxctraining.entities.Book;
import com.dxctraining.exceptions.*;
import java.util.*;

public class BookDaoImp implements IbookDao
{
		    private Map<String, Book> store = new HashMap<>();
		    private int id;
		    public String genId()
		    {
		        id++;
		        String strid=""+id;
		        return strid;
		    }
		    @Override
		    public Book findBookId(String id) {
		        Book book=store.get(id);
		        if(book==null)
		        {
		            throw new BookNotFoundException("Book not found or id is wrong");
		        }
		        return book;
		    }
		    
		    private void checkId(Book book) {
				String id = book.getId();
				if (id == null) {
					throw new InvalidArgumentException("book can't be null" + id);
				}
			}

		    @Override
		    public Book updateBookcost(String id, double cost) {
		       Book book=findBookId(id);
		       book.setCost(cost);
		       return book;
		    }
		    
		    @Override
			public void bookDetails(Book book) {
				checkId(book);
				String detail = book.getId();
				store.get(detail);
			}
		    
		    @Override
		    public void addBook(Book book) {
		        String id=book.getId();
		        store.put(id,book);
		        book.setId(id);
		    }

		    @Override
		    public void removeBook(String id) {
		        store.remove(id);
		    }
		    @Override
		    public List<Book> findAllBooks() {
		     Collection<Book> collection=store.values();
		     List<Book>list=new ArrayList<>();
		     for(Book books:collection)
		     {
		         list.add(books);
		     }
		     return list;
		    }
}
