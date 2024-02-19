package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.UserDao;
import com.dbmsproject.models.User;
import com.dbmsproject.repositories.UserRepository;

@Service
public class NewUserService {

    @Autowired
    private UserRepository userRepository;

    public boolean createNewUser(User user){
        UserDao existingUser = userRepository.findById(user.getPhoneNumber()).orElse(null);
        if (existingUser != null) return false;
        userRepository.save(new UserDao(user.getName(), user.getPhoneNumber(), user.getPassword()));
        return true;
    }
    
}
