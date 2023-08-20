package com.demo.gradle.first.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gradle.first.repository.ReaderRepository;

@Service
public class ReaderService {
	private static final Logger log = LoggerFactory.getLogger(ReaderService.class);
	
	@Autowired
	private ReaderRepository rr;
	
	//view user list
	public List<String> getUsers(){
		log.info("user list");
		return rr.gerUsers();
	}

}
