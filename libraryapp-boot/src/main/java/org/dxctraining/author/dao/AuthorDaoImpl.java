package org.dxctraining.author.dao;

import org.dxctraining.author.entities.Author;
import org.dxctraining.author.exceptions.AuthorNotFoundException;
import org.dxctraining.author.exceptions.InvalidArgumentException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
public class AuthorDaoImpl implements IAuthorDao
{
	    @PersistenceContext
	    private EntityManager entityManager;
	    @Override
	    public Author findAuthorID(String id) {
	        Author author=entityManager.find(Author.class,id);
	        if(author==null)
	        {
	            throw  new AuthorNotFoundException("Author not found");
	        }
	        return author;
	    }

	    @Override
	    public void addAuthor(Author author) {
	        entityManager.persist(author);
	    }

	    @Override
	    public Author updateName(Author author, String name){
	        if(name==null)
	        {
	            throw new InvalidArgumentException("name can't be null");
	        }
	        else
	            author.setName(name);
	        return author;
	    }

	    @Override
	    public void removeAuthor(String id) {
	        entityManager.remove(id);
	    }
}
