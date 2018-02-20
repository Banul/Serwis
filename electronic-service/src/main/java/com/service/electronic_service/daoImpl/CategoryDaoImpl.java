package com.service.electronic_service.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.service.electronic_service.dao.CategoryDao;
import com.service.electronic_service.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao{

	@PersistenceContext
     EntityManager em;
	
	public List<Category> getCategoryTypes() {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Category> cq = cb.createQuery(Category.class);
		Root<Category> category = cq.from(Category.class);
		TypedQuery<Category> q = em.createQuery(cq);
		List<Category> allCategories = q.getResultList();

		return allCategories;
	
	}
	

}
