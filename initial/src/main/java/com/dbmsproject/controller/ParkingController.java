package com.dbmsproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbmsproject.business.InitializationService;
import com.dbmsproject.business.LocationService;
import com.dbmsproject.business.SlotTypeAndPriceService;
import com.dbmsproject.models.Location;
import com.dbmsproject.models.SlotTypeAndPrice;

@RestController
public class ParkingController {

	@Autowired
    InitializationService initializationService;

	@Autowired
    LocationService locationService;

    @Autowired
    SlotTypeAndPriceService slotTypeAndPriceService;

	@GetMapping("/")
	public String index() {
		return "Hello world";
	}

	@PostMapping("/initialize")
    public void initializeParkingLot(){
        initializationService.initialize();
    }

	@RequestMapping("/getParkingLots")
    public List<Location> getLocCode(){
        return locationService.getParkingLots();
    }

    @RequestMapping(method=RequestMethod.GET, value="/getSlotTypesAndPrice/{locCode}")
    public List<SlotTypeAndPrice> getSlotTypesAndPricesm(@PathVariable int locCode){
        return slotTypeAndPriceService.getSlotTypesAndPrices(locCode);
    }
	
}
