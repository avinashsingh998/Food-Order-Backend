package com.springboot.foodorder.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String username;
	String password;
	

	public User() {
		// TODO Auto-generated constructor stub
	}

}
