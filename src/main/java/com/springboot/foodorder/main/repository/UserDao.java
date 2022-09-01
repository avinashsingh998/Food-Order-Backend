package com.springboot.foodorder.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.foodorder.main.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}
