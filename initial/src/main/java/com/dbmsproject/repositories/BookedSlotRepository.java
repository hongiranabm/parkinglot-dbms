package com.dbmsproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.BookedSlotsDao;

public interface BookedSlotRepository extends CrudRepository <BookedSlotsDao, Integer>{
    
}
