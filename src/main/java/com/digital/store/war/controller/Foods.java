package com.digital.store.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Foods {

	@GetMapping("/foods")
	public String digistore() {
		return "Food is good for health.";
	}

}
