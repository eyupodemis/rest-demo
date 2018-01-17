package org.javaninja.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "check-health", method = RequestMethod.GET)
	public String checkHealth() {
		logger.info("Health Check!");
		return "{\"status\":\"UP\"}";
	}

}
