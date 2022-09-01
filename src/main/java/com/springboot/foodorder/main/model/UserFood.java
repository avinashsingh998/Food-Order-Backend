package com.springboot.foodorder.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class UserFood {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@OneToOne
	Food food;
	int count;
	
	@ManyToOne
	UserDetails userDetails;

	public UserFood(Food food, int count) {
		super();
		this.food = food;
		this.count = count;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public UserFood() {
		// TODO Auto-generated constructor stub
	}

}
