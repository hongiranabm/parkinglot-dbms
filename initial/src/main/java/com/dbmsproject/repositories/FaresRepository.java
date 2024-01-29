package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.FaresDao;

public interface FaresRepository extends CrudRepository <FaresDao, Integer> {
    
}
