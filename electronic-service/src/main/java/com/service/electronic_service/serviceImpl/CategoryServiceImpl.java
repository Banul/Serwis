package com.service.electronic_service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.service.electronic_service.dao.CategoryDao;
import com.service.electronic_service.model.Category;
import com.service.electronic_service.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	
	
	public List<Category> getCategoryTypes() {
		return categoryDao.getCategoryTypes();
	}

}
