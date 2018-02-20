package com.service.electronic_service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@Column (name = "id")
	@SequenceGenerator (name = "pk_sequence", sequenceName = "role_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
	private int idRole;
	
	@Column(name = "role")
	private String role;
	
	
	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	

}
