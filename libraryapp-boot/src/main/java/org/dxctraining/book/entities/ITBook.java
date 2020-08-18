package org.dxctraining.book.entities;
import org.dxctraining.author.entities.Author;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ITBook extends Book
{
	    @Id
	    private String id;
	    private String Iname;

	    public ITBook(String name, Author author, String id) {
	        super(name, author, id);
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
	        if (o == null || getClass() != o.getClass())
	            return false;
	        ITBook itbook = (ITBook) o;
	        return id.equals(itbook.id);
	    }

	    @Override
	    public int hashCode() {
	        int hashid=id.hashCode();
	        return hashid;
	    }
}
