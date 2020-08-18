package org.dxctraining.author.services;

import org.dxctraining.author.entities.Author;

public interface IAuthorService 
{
    public Author findAuthorID(String id);
    public void addAuthor(Author author);
    public Author updateName(Author author, String name);
    public void removeAuthor(String id);

}
