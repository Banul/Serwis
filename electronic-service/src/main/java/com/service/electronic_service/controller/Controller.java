package com.service.electronic_service.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.electronic_service.model.Category;
import com.service.electronic_service.model.Item;
import com.service.electronic_service.service.CategoryService;
import com.service.electronic_service.service.ItemService;

@RestController
@RequestMapping(value = "/Components")
public class Controller {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;

	@GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> returnData() {
		return categoryService.getCategoryTypes();

	}

	@GetMapping(value = "/{item}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> returnItemData(@PathVariable String item) {
		return itemService.getItems(item);
	}

	@PutMapping(value = "/put/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void putCustomer(@RequestBody Item item, @PathVariable int id) {

		itemService.updateItem(item);
	}
	

}
