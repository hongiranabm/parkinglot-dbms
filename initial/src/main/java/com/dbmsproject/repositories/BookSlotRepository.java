package com.dbmsproject.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.BookSlotDao;

public interface BookSlotRepository extends CrudRepository <BookSlotDao, Integer>{
    @Query(value = "SELECT COUNT(*) FROM book_slot_dao WHERE loc_code = ?1 AND slot_type_id = ?2", nativeQuery = true)
    Integer getNumberOfBookedSlots(int locCode, int slotTypeId);
}
