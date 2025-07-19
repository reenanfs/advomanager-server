package com.advomanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
	@GetMapping("api/v1/health")
	public String healthCheck() {
		return "The server is up and running";
	}
}
