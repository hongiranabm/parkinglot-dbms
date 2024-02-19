package com.dbmsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dbmsproject.business.LoginService;
import com.dbmsproject.business.NewUserService;
import com.dbmsproject.business.SignInService;
import com.dbmsproject.dao.UserDao;
import com.dbmsproject.models.User;

@Controller
public class WebController {
    
    @Autowired
    private SignInService signinService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private NewUserService newUserService;

    String loginId;

    @GetMapping("/signup")
	public String signup(Model model) {
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
	public String login(Model model) {
        model.addAttribute("user", new User());
        return "login_page";
	}

    @GetMapping(path = "/signin")
	public String signin(@ModelAttribute User user, Model model) {
        boolean signinSuccess = signinService.logIn(user.getPhoneNumber(),user.getPassword());
        if (signinSuccess) {
            UserDao loginInfo = loginService.getInfo(user.getPhoneNumber());
			model.addAttribute("loginInfo", loginInfo);
			loginId=loginInfo.getName();
        	return "location_page";
        }
        return "login_page";
	}
}

