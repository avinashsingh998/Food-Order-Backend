package com.springboot.foodorder.main.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserDetails  {
	
	@Id	
	long id;
	@OneToOne
	User user;
	@OneToMany
	List<UserFood> foods = new LinkedList<>();
	
	
	

	public UserDetails() {
		super();
	}

}
