package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.SlotTypeDao;

public interface SlotTypeRepository extends CrudRepository <SlotTypeDao, Integer> {
    
}
