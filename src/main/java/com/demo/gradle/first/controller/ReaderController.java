package com.demo.gradle.first.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gradle.first.service.ReaderService;

@RestController
public class ReaderController {

	private static final Logger log = LoggerFactory.getLogger(ReaderController.class);
	
	@Autowired
	private ReaderService rs;
	
	//get_users
	@GetMapping("/get_users")
	public List<String> get_users(){
		log.info("user_list");
		return rs.getUsers();
	}
	
	
}
