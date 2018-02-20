package com.service.electronic_service.model;


import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table (name = "category")
@JsonSerialize 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonFilter("categoryFilter")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "idCategory")

public class Category {

	@Id
	@Column (name = "id")
	private int idCategory;
	
	@Column (name = "type")
	private String type;
	
	@OneToMany(mappedBy="category")
	@JsonManagedReference
	  private List<Item> items;



	public List<Item> getItems() {
		return items;
	}

	  

	public void setItems(List<Item> items) {
		this.items = items;
	}


	public int getIdCategory() {
		return idCategory;
	}



	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
