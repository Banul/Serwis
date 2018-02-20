package com.service.electronic_service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.service.electronic_service.model.Category;


public interface CategoryDao {
	
	public List<Category> getCategoryTypes();
}
