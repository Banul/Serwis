package com.service.electronic_service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table (name = "parameter")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonSerialize 
@JsonFilter("parameterFilter")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "idParameter")

public class Parameter {
	
	@Id
	@Column (name = "id")
	@SequenceGenerator(name="pk_sequence",sequenceName="parameter_id_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="pk_sequence")
	private int idParameter;
	
	@Column (name = "description")
	private String descriptionParameter;
	
	@Column (name = "value")
	private String value;


	public int getIdParameter() {
		return idParameter;
	}

	public void setIdParameter(int idParameter) {
		this.idParameter = idParameter;
	}

	public String getDescriptionParameter() {
		return descriptionParameter;
	}

	public void setDescriptionParameter(String descriptionParameter) {
		this.descriptionParameter = descriptionParameter;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}

	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="par_item_id")
	@JsonBackReference
	
	private Item item;
	

}
