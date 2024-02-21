package com.dbmsproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import com.dbmsproject.business.BookedSlotService;
import com.dbmsproject.business.LocationService;
// import com.dbmsproject.business.LoginService;
import com.dbmsproject.business.NewUserService;
import com.dbmsproject.business.SignInService;
import com.dbmsproject.business.SlotTypeAndPriceService;
import com.dbmsproject.models.BookedSlot;
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

    // @Autowired
    // private BookedSlotService bookedSlotService;
    

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
		return "signup_page";
	}

    @GetMapping(path = "/login")
	public String logIn(Model model) {
        model.addAttribute("user", new User());
        return "login_page";
	}

    @GetMapping(path = "/signin")
	public String signIn(@ModelAttribute User user, Model model) {
        boolean signinSuccess = signinService.logIn(user.getPhoneNumber(),user.getPassword());
        if (signinSuccess) {
		    model.addAttribute("locationList", locationService.getAllLocations());
        	return "location_page";
        }
        return "login_page";
	}

    @GetMapping(path = "/getSlotTypesAndPrices")
	public String getSlots(Model model, @RequestParam("location") int locCode) {
		model.addAttribute("slotTypesAndPricesList", slotTypeAndPriceService.getSlotTypesAndPrices(locCode));
        return "slots_page";
	}

    @GetMapping(path = "/payments")
	public String getPrices(Model model, @RequestParam("vehicle-type") int vehType, @RequestParam("loc-code") int locCode) {
		model.addAttribute("slotTypeAndPrice", slotTypeAndPriceService.getSlotTypesAndPrices(locCode, vehType));
        return "payment_page";
	}

    // @PostMapping("/booking")
	// public String booking(@ModelAttribute BookedSlot bookedSlot, Model model) {
    //     if(bookedSlotService.insertBookedSlot(bookedSlot))
    //         return "login_page";
	// 	return "signup_page";
	// }

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

