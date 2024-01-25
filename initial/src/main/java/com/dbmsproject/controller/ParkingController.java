package com.dbmsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

	@GetMapping("/")
	public String index() {
		return "HI HONGI";
	}

}
