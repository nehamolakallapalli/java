package com.dxctraining.ui;

import com.dxctraining.entities.Author;
import com.dxctraining.entities.Book;
import com.dxctraining.services.*;
import java.util.List;

public class LibraryMain 
{
	    private IbookService bookservice=new BookServiceImpl();
	    public static void main(String args[])
	    {
	        LibraryMain libapp=new LibraryMain();
	        libapp.run();
	    }

	    private void run() {
	        Author author1 = new Author("1", "aaaa");
	        Author author2 = new Author("2", "bbbbb");
	        Book book1 = new Book("A1","C",150.00, author1);
	        Book book2 = new Book("B1","Java",200.00, author2);
	        
	        bookservice.addBook(book1);
	        bookservice.addBook(book2);
	        findAllBooks();
	    }

	    private void findAllBooks() {
	        List<Book> list=bookservice.findAllBooks();
	        for(Book book:list)
	        {
	            display(book);
	        }
	    }

	    private void display(Book book) {
	        System.out.println("display the books details");
	        Author author=book.getAuthor();
	        System.out.println("The author is "+author.getName()+" Name of the book "+book.getName()+
	                " The price "+book.getCost());
	    }
}
