package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.LoginDao;

public interface LoginRepository extends CrudRepository <LoginDao, Integer> {
    
}