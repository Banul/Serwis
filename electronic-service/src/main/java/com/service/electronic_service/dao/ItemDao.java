package com.service.electronic_service.dao;

import java.util.List;

import com.service.electronic_service.model.Item;

public interface ItemDao {

	public List<Item> getItems(String itemParameter);
	
	public void updateItem (Item item);
	
}
