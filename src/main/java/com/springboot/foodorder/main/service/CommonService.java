package com.springboot.foodorder.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.foodorder.main.model.Admin;
import com.springboot.foodorder.main.model.Food;
import com.springboot.foodorder.main.repository.AdminDao;
import com.springboot.foodorder.main.repository.FoodDao;
import com.springboot.foodorder.main.repository.UserDao;

@Service
public class CommonService implements ICommonService {
	
	@Autowired
	AdminDao ad;
	
	@Autowired
	FoodDao fd;

	@Override
	public void addAdmin(Admin admin) {
		ad.save(admin);
		
	}

	@Override
	public List<Admin> getAdmin(String name) {
		return ad.findByUsername(name);
		
	}

	@Override
	public List<Food> getAllFoods() {
		
		return fd.findAll();
	}

	@Override
	public void addFood(Food food) {
		fd.save(food);
		
	}

	@Override
	public Food getFoodById(long id) {
		return this.fd.findById(id).get();
	}

}
