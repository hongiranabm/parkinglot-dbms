package com.dbmsproject.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.ParkingLotCapacityDao;

public interface ParkingLotCapacityRepository extends CrudRepository <ParkingLotCapacityDao, Integer>{
    @Query(value = "SELECT SUM(capacity) FROM parking_lot_capacity_dao WHERE loc_code = ?1 AND slot_type_id = ?2", nativeQuery = true)
    Integer getTotalCapacity(int locCode, int slotTypeId);
    
} 