package com.service.electronic_service.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.service.electronic_service.dao.ItemDao;
import com.service.electronic_service.model.Category;
import com.service.electronic_service.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {

	@PersistenceContext
	EntityManager em;
	

    @Autowired
    JdbcTemplate jdbcTemplate;

	public List<Item> getItems(String itemParameter) {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Item> cq = cb.createQuery(Item.class);
		Root<Item> item = cq.from(Item.class);

		cq.select(item).where(cb.equal(item.get("category").get("type"), itemParameter));

		TypedQuery<Item> q = em.createQuery(cq);
		List<Item> allCategories = q.getResultList();

		return allCategories;

	}

	@Transactional
	public void updateItem(Item item) {

		String newStatus;

		if (item.getStatus().equals("zepsuty"))
			newStatus = "sprawny";
		else
			newStatus = "zepsuty";
		
		System.out.println(newStatus);

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Item> update = cb.createCriteriaUpdate(Item.class);

		Root<Item> root = update.from(Item.class);

		update.set("status", newStatus);
		update.where(cb.equal(root.get("idItem"), item.getIdItem()));

		 this.em.createQuery(update).executeUpdate();
		 

	}

}
