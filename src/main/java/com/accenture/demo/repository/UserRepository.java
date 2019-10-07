package com.accenture.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
