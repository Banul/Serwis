package com.service.electronic_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.electronic_service.model.Category;


public interface CategoryService {

	public List<Category> getCategoryTypes();

}
