package com.dbmsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbmsproject.business.InitializationService;

@RestController
public class ParkingController {

	@Autowired
    InitializationService initializationService;

	@GetMapping("/")
	public String index() {
		return "HI HONGI";
	}

	@PostMapping("/initialize")
    public void initializeParkingLot(){
        initializationService.initialize();
    }

}
