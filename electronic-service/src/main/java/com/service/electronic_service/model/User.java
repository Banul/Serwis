package com.service.electronic_service.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "active_user")
public class User {

	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "pk_sequence", sequenceName = "user_id_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
	private int user_id;

	@Column(name = "email")
	@Email(message = "Proszę podać poprawny adres email")
	@NotEmpty(message = "To pole nie może być puste")
	private String email;

	@Column(name = "password")
	@Length(min = 7, message = "Hasło musi mieć minimalnie 5 znaków")
	@NotEmpty(message = "To pole nie może być puste")
	@Transient
	private String password;

	@Column(name = "first_name")
	@NotEmpty(message = "Proszę podać swoje imie")
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty(message = "Proszę podać swoje nazwisko")
	private String lastName;

	@Column(name = "enabled")
	private int enabled;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userrole_user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "userrole_role_id", referencedColumnName = "id"))
	private Set<Role> roles;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

}
