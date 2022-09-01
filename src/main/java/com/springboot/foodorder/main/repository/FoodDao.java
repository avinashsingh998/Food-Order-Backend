package com.springboot.foodorder.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.foodorder.main.model.Food;

public interface FoodDao extends JpaRepository<Food, Long> {
	
	

}
