package com.demo.gradle.first.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.gradle.first.model.User_location;

@Repository
public interface ReaderRepository extends JpaRepository<User_location, Integer>{
	
	public abstract User_location findByName(String name);
	
//	view user list
	@Modifying
	@Transactional
	@Query(value = "SELECT name FROM user_location", nativeQuery = true)
	public abstract List<String> gerUsers();

}
