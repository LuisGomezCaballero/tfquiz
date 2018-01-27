package com.luisgomezcaballero.tfquiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("dummy")
	public String dummyController() {
		return "dummy";
	}
	
}
