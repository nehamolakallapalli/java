package com.dxctraining.services;

import com.dxctraining.entities.Item;

public interface IItemService 
{
	 Item update(Item item);

	 Item save(Item item);

     void remove(int id);

	 Item findItemById(int id);
}
