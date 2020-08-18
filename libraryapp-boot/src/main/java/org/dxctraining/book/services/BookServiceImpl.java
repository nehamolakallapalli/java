package org.dxctraining.book.services;

import org.dxctraining.book.dao.*;
import org.dxctraining.book.entities.*;
import org.dxctraining.book.exceptions.InvalidArgumentException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service
public class BookServiceImpl implements IbookService
{
	    @Autowired
	    private IbookDao bookDao;
	    @Override
	    public Book findBookId(String id) {
	       validateId(id);
	       Book book=bookDao.findBookId(id);
	        return book;
	    }

	    private void validateId(String id) {
	     if(id==null ||id.isEmpty())
	     {
	         throw new InvalidArgumentException("ID cant be null or empty");
	     }
	    }

	    @Override
	    public void removeBook(String id) {
	        validateId(id);
	        bookDao.removeBook(id);

	    }

	    @Override
	    public void addBook(Book book) {
	        validateBook(book);
	        bookDao.addBook(book);

	    }

	    @Override
	    public List<Book> showBooks() 
	    {
	     List<Book> list=bookDao.showBooks();
	     return list;
	    }

	    private void validateBook(Book book) {
	        if(book==null)
	        {
	            throw new InvalidArgumentException("cant be null");
	        }
	    }
}