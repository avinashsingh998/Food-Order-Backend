package com.springboot.foodorder.main.service;

import java.util.List;

import com.springboot.foodorder.main.model.Admin;
import com.springboot.foodorder.main.model.Food;

public interface ICommonService {
	
	public void addAdmin(Admin admin);
	public List<Admin> getAdmin(String name);
	public List<Food> getAllFoods();
	public void addFood(Food food);
	public Food getFoodById(long id);
		
	

}
