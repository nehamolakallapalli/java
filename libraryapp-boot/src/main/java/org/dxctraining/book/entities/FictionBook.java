package org.dxctraining.book.entities;

import org.dxctraining.author.entities.Author;

import javax.persistence.Id;
import java.util.Objects;

public class FictionBook extends Book
{
	    @Id
	    private String id;
	    private String Iname;
	    public FictionBook(String Iname, Author author, String id)
	    {
	        super(Iname, author, id);
	    }
	    @Override
	    public String getId() {
	        return id;
	    }
	    @Override
	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getIname() {
	        return Iname;
	    }

	    public void setIname(String iname) {
	        Iname = iname;
	    }
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        FictionBook that = (FictionBook) o;
	        return id.equals(that.id);
	    }

	    @Override
	    public int hashCode() {
	        int strid=id.hashCode();
	        return strid;
	    }
}
