package com.demo.gradle.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gradle.first.model.User_location;
import com.demo.gradle.first.service.AdminService;

@RestController
public class AdminController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService as;
	
	@PutMapping("/update_data{name}")
	public User_location update(@PathVariable("name") String name,
			@RequestBody User_location location) {
		log.info("Admin controller update location");
		return as.update(location);
	}
	

}
