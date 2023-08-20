package com.demo.gradle.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gradle.first.model.User_location;
import com.demo.gradle.first.service.User_locationService;

@RestController
public class User_locationController {

	private static final Logger log = LoggerFactory.getLogger(User_locationController.class);
	
	@Autowired
	private User_locationService uls;
	
	@PostMapping("/create_data")
	public User_location create_data(@RequestBody User_location location) {
		log.info("location controller");
		return uls.create_data(location);
	}
	
}
