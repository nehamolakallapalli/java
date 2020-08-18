package org.dxctraining.ui;

import org.dxctraining.author.entities.Author;
import org.dxctraining.author.services.*;
import org.dxctraining.book.entities.*;
import org.dxctraining.book.services.IbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class BookUI 
{
	    @Autowired
	    private IbookService bookservice;
	    @Autowired
	    private IAuthorService authorService;
	    @PostConstruct
	    public void runApp() {

	        Author author1 = new Author("1", "aaaa");
	        Author author2 = new Author("2", "bbbb");
	        Author author3 = new Author("3", "cccc");
	        Author author4 = new Author("4", "dddd");
	        authorService.addAuthor(author1);
	        authorService.addAuthor(author2);
	        authorService.addAuthor(author3);
	        authorService.addAuthor(author4);
	        //BOOKS
	        Book book1 = new Book("stories", author1, "b1");
	        Book book2 = new Book("fairy tails", author2, "b2");
	        //FICTION AND ITBOOKS
	        FictionBook book3 = new FictionBook("ficiton1",author3,"f1");
	        ITBook book4 = new ITBook("IT", author4, "v4");
	        bookservice.addBook(book1);
	        bookservice.addBook(book2);
	        bookservice.addBook(book3);
	        bookservice.addBook(book4);
	        Showbooks();
	    }
	    public void Showbooks() {
	        System.out.println("displaying the books details");
	        List<Book> list= bookservice.showBooks();
	        for(Book book:list)
	        {
	            displayAll(book); //display all books
	            boolean isFiction=book instanceof FictionBook;
	            if(isFiction)
	            {
	                fictionBook(book);
	            }
	            else
	            {
	                itBook(book);
	            }

	        }
	    }
	    private void displayAll(Book book) {

	        Author author=book.getAuthor();
	        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
	              " Author ID="+author.getId()+" The book Id "+book.getId());
	    }

	    public void fictionBook(Book book)
	    {

	        Author author=book.getAuthor();
	        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
	                " Author ID="+author.getId()+" The book Id "+book.getId());
	    }

	    private void itBook(Book book) {
	        Author author=book.getAuthor();
	        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
	                " Author ID="+author.getId()+" The book Id "+book.getId());
	    }
}