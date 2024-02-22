package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.UserDao;
import com.dbmsproject.repositories.UserRepository;

@Service
public class SignInService {
    @Autowired
    private UserRepository userRepository;
    
    public String logInOrReturnError(Long phoneNumber, String password){
        UserDao user = userRepository.findById(phoneNumber).orElse(null);

        if (user != null && user.getPassword().equals(password))
            return "";

        return user == null ? "User does not exist!" : "Incorrect password!";
    }
}
