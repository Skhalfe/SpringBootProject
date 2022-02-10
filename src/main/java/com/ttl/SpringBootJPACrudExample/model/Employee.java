package com.ttl.SpringBootJPACrudExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastName;



	@Column(name = "email")
	private String email;



	public long getId() {
	return id;
	}



	public void setId(long id) {
	this.id = (int) id;
	}



	public String getFirstName() {
	return firstname;
	}



	public void setFirstName(String firstName) {
	this.firstname = firstName;
	}



	public String getLastName() {
	return lastName;
	}



	public void setLastName(String lastName) {
	this.lastName = lastName;
	}



	public String getEmail() {
	return email;
	}



	public void setEmail(String email) {
	this.email = email;
	}


}
