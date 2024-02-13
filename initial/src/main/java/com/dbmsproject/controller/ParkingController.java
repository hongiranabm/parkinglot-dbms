package com.dbmsproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbmsproject.business.InitializationService;
import com.dbmsproject.business.LocationService;
import com.dbmsproject.models.Location;
import com.dbmsproject.models.SlotTypeAndPrice;

@RestController
public class ParkingController {

	@Autowired
    InitializationService initializationService;

	@Autowired
    LocationService locationService;

	@GetMapping("/")
	public String index() {
		return "HI HONGI";
	}

	@PostMapping("/initialize")
    public void initializeParkingLot(){
        initializationService.initialize();
    }

	@RequestMapping("/getParkingLots")
    public List<Location> getLocCode(){
        return locationService.getParkingLots();
    }

    @RequestMapping(method=RequestMethod.GET, value="/getSlotTypesAndPrice/{parking_lot_id}")
    public List<SlotTypeAndPrice> GetSlotTypesAndPrice(){
        return null;
    }
	
}
