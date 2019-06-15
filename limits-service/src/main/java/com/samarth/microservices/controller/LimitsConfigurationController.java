package com.samarth.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samarth.microservices.bean.LimitConfiguration;
import com.samarth.microservices.configuration.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsConfigurations()
	{
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
