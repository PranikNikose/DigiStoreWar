package com.digital.store.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodsController {

	@GetMapping("/foods")
	public String sayHello() {
		return "Food is Good For health!";
	}
}
