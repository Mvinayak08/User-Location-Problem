package com.demo.gradle.first.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gradle.first.model.User_location;
import com.demo.gradle.first.repository.User_location_Repository;

@Service
public class User_locationService {
	
	private static final Logger log = LoggerFactory.getLogger(User_locationService.class);
	
	@Autowired
	private User_location_Repository ulr;
	
	
	//create_data
	public User_location create_data(User_location location) {
		log.info("user_location service");
		return ulr.save(location);
	}

}
