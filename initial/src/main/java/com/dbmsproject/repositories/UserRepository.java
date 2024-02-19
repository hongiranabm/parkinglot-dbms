package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.UserDao;

public interface UserRepository extends CrudRepository <UserDao, Long> {
    
}