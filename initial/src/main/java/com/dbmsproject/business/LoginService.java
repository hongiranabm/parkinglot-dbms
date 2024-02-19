package com.dbmsproject.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.UserDao;
import com.dbmsproject.repositories.UserRepository;

@Service
public class LoginService {
    
    @Autowired
    private UserRepository loginRepository;

    public UserDao getInfo(Long phonenumber)
    {
        List<UserDao> loginList = (List<UserDao>) loginRepository.findAll();
        for(int i=0; i< loginList.size(); i++){
            if(loginList.get(i).getPhone() == phonenumber ){
                return loginList.get(i);
            }
        }
        return null;
    }
}
