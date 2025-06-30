package com.digital.store.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String home() {
		return "Welcome to SpringBoot - Pranik Nikose";
	}
}
