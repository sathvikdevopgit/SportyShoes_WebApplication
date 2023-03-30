package com.simplilearn.webapp.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String email;
	private String password;
	
	public Admin() {
		super();
	}

	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return String.format("Admin [email=%s, password=%s]", email, password);
	}
	
	
}