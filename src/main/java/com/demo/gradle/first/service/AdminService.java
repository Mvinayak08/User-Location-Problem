package com.demo.gradle.first.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gradle.first.model.User_location;
import com.demo.gradle.first.repository.AdminRepository;

@Service
public class AdminService {
	
	private static final Logger log = LoggerFactory.getLogger(AdminService.class);
	
	@Autowired
	private AdminRepository ar;
	
	//update
	public User_location update(User_location location) {
		log.info("Admin service");
		return ar.save(location);
	}

}
