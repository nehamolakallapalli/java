package com.dxctraining.services;

import com.dxctraining.dao.BookDaoImp;
import com.dxctraining.dao.IbookDao;
import com.dxctraining.entities.Book;
import com.dxctraining.exceptions.BookcostException;
import com.dxctraining.exceptions.InvalidArgumentException;
import java.util.List;

public class BookServiceImpl implements IbookService
{
	private IbookDao bookDao=new BookDaoImp();
	
	    @Override
	    public Book findBookId(String id) {
	        validateId(id);
	        Book book=bookDao.findBookId(id);
	        return book;
	    }

	    @Override
	    public Book updateBookcost(String id, double cost) {
	        validateId(id);
	        validatecost(cost);
	        Book book=bookDao.updateBookcost(id,cost);
	        return book;
	    }

	    @Override
	    public void removeBook(String id) {
	        validateId(id);
	        bookDao.removeBook(id);

	    }

	    @Override
	    public void addBook(Book book) {
	        bookDao.addBook(book);
	    }
	    
	    @Override
		public void bookDetails(Book book) {
			bookDao.bookDetails(book);
		}
	    
	    @Override
	    public List<Book> findAllBooks() {
	       List<Book>list=bookDao.findAllBooks();
	       return list;
	    }
	    
	    private void validateId(String id) {
	        if(id==null || id.isEmpty())
	        {
	            throw new InvalidArgumentException("Book Id can't be null or empty");
	        }
	    }
	    
	    private void validatecost(double cost) {
	        if(cost<0)
	        {
	            throw new BookcostException("The cost can't be negative");
	        }
	    }
}