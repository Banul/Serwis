package com.service.electronic_service.service;

import java.util.List;

import com.service.electronic_service.model.Category;
import com.service.electronic_service.model.Item;

public interface ItemService {

	public  List <Item> getItems(String itemParameter);
	
	public void updateItem(Item item);
}
