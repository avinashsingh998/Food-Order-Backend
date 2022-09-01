package com.springboot.foodorder.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.foodorder.main.model.UserFood;

public interface UserFoodDao extends JpaRepository<UserFood, Long>{

}
