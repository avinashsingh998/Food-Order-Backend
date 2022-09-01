package com.springboot.foodorder.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.foodorder.main.model.UserDetails;

public interface UserDetailsDao extends JpaRepository<UserDetails, Long> {

}
 