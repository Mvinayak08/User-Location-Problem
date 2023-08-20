package com.demo.gradle.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.gradle.first.model.User_location;

@Repository
public interface User_location_Repository extends JpaRepository<User_location, Integer>{
	
	public abstract User_location findByName(String name);

}
