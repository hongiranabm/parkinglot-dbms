package com.dbmsproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.dao.FaresDao;

public interface FaresRepository extends CrudRepository <FaresDao, Integer> {
    @Query(value = "SELECT * FROM fares_dao WHERE loc_code = ?1", nativeQuery = true)
    List<FaresDao> findBylocCode(int locCode);
}
