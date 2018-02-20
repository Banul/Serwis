package com.service.electronic_service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.electronic_service.dao.CategoryDao;
import com.service.electronic_service.dao.ItemDao;
import com.service.electronic_service.model.Item;
import com.service.electronic_service.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemDao itemDao;
	
	public List <Item> getItems(String itemParameter)
	{
		return this.itemDao.getItems(itemParameter);
	}

	public void updateItem(Item item) {

		itemDao.updateItem(item);
	}
	
	

}
