package com.springboot.foodorder.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.foodorder.main.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {
	
	public List<Admin> findByUsername(String username);

}
