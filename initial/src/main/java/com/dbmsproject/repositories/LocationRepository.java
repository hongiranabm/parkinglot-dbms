package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.LocationDao;

public interface LocationRepository extends CrudRepository <LocationDao, Integer> {
    
}
