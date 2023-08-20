package com.demo.gradle.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	private static final Logger log = LoggerFactory.getLogger(Hello.class);
	@RequestMapping("/hello")
	public String hello() {
		log.info("Hello controller just for demo purpose");
		return "Hello World! for demo purpose";
	}

}
