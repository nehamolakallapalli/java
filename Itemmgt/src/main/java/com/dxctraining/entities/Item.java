package com.dxctraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item 
{
	    @Id
	    @GeneratedValue
	    private int id;
	    private String name;

	    public Item() {

	    }

	    public Item(String name) 
	    {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public boolean equals(Object object) {
	        if (this == object) return true;
	        if (object == null || getClass() != object.getClass()) {
	            return false;
	        }
	        Item that = (Item) object;
	        return id == that.id;
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }
}
