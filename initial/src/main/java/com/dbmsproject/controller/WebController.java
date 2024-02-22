package com.dbmsproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbmsproject.business.BookSlotService;
// import com.dbmsproject.business.BookedSlotService;
import com.dbmsproject.business.LocationService;
// import com.dbmsproject.business.LoginService;
import com.dbmsproject.business.NewUserService;
import com.dbmsproject.business.SignInService;
import com.dbmsproject.business.SlotTypeAndPriceService;
import com.dbmsproject.models.BookSlot;
import com.dbmsproject.models.SlotTypeAndPrice;
// import com.dbmsproject.dao.UserDao;
import com.dbmsproject.models.User;

@Controller
public class WebController {
    
    @Autowired
    private SignInService signinService;

    // @Autowired
    // private LoginService loginService;

    @Autowired
    private NewUserService newUserService;

    @Autowired
    private BookSlotService bookSlotService;
    

    @Autowired
    private LocationService locationService;

    @Autowired
    private SlotTypeAndPriceService slotTypeAndPriceService;

    String loginId;

    @GetMapping("/firstPage")
	public String firstPage(Model model) {
		return "first_page";
	}

    @GetMapping("/home")
	public String home(Model model) {
		return "first_page";
	}

    @GetMapping("/signup")
	public String signUp(Model model) {
        model.addAttribute("user", new User());
		return "signup_page";
	}

    @PostMapping("/createUser")
	public String createUser(@ModelAttribute User user, Model model) {
        if(newUserService.createNewUser(user))
            return "login_page";
        model.addAttribute("userExistsError", "Phone number already exists!");
		return "signup_page";
	}

    @GetMapping(path = "/login")
	public String logIn(Model model) {
        model.addAttribute("user", new User());
        return "login_page";
	}

    @GetMapping(path = "/signin")
	public String signIn(@ModelAttribute User user, Model model) {
        String signinError = signinService.logInOrReturnError(user.getPhoneNumber(),user.getPassword());
        if (signinError.equals("")) {
		    model.addAttribute("locationList", locationService.getAllLocations());
		    model.addAttribute("phone", user.getPhoneNumber());
        	return "location_page";
        }
        model.addAttribute("loginError", signinError);
        return "login_page";
	}

    @GetMapping(path = "/getSlotTypesAndPrices")
	public String getSlots(Model model, @RequestParam("location") int locCode, @RequestParam("phone") Long phone) {
		model.addAttribute("slotTypesAndPricesList", slotTypeAndPriceService.getSlotTypesAndPrices(locCode));
		model.addAttribute("phone", phone);
        return "slots_page";
	}

    @GetMapping(path = "/payments")
	public String getPrices(Model model, @RequestParam("vehicle-type") int vehType, @RequestParam("loc-code") int locCode, @RequestParam("phone") Long phone) {
        SlotTypeAndPrice slotTypeAndPrice = slotTypeAndPriceService.getSlotTypesAndPrices(locCode, vehType);
        BookSlot bookSlot = new BookSlot(locCode, slotTypeAndPrice.getSlotTypeId(), phone);
		model.addAttribute("phone", phone);
        if(!bookSlotService.slotAvailable(bookSlot)){
            model.addAttribute("slotNotAvailableError", "Oops! No more required slots available...");
		    model.addAttribute("locationList", locationService.getAllLocations());
            return "location_page";
        }
		model.addAttribute("slotTypeAndPrice", slotTypeAndPrice);
        return "payment_page";
	}

    @PostMapping("/bookSlot")
	public String bookSlot(Model model, @RequestParam("slotTypeId") int slotTypeId, @RequestParam("locCode") int locCode, @RequestParam("phone") Long phone) {
        BookSlot bookSlot = new BookSlot(locCode, slotTypeId, phone);
        bookSlotService.bookSlot(bookSlot);
        return "last_page";
	}

    // @GetMapping(path = "/chooseLocationAndSlot")
	// public String bookSlots(Model model) {
	// 	model.addAttribute("locationList", locationService.getAllLocations());
	// 	return "last_page";
	// }

    // @GetMapping(path = "/chooseLocationAndSlot/{slotStartTime}")
	// public String booking(@PathVariable int slotStartTime, Model model) {
	// 	 bookingService.slotBooking(new BookSlot(voterId, slotStartTime));
	// 	 return "index"; 
	// }
}

