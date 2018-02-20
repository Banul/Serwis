package com.service.electronic_service.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table (name = "item")
@JsonSerialize 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonFilter("itemFilter")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idItem")

public class Item {
	

	@Column (name = "id")
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="item_id_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="pk_sequence")
	private int idItem;
	
	@Column (name = "status")
	private String status;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "serialNumber")
	private String serialNumber;
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}



	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	@ManyToOne (targetEntity=Category.class, fetch=FetchType.LAZY)
	@JoinColumn(name="item_cat_id")
    @JsonBackReference

	private Category category;
	
	@OneToMany(mappedBy="item")
    @JsonManagedReference

	  private List<Parameter> parameters;

}
