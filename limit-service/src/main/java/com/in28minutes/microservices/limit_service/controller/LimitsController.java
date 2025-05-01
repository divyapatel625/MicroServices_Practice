package com.in28minutes.microservices.limit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limit_service.bean.Limit;
import com.in28minutes.microservices.limit_service.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limit")
	public Limit retriveLlimit() {
		return new Limit(config.getMinimum(),config.getMaximum());
	}
}
  