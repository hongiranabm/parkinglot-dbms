package com.dbmsproject.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.LocationDao;
import com.dbmsproject.models.Location;
import com.dbmsproject.repositories.LocationRepository;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations(){
        List<Location> locationList = new ArrayList<>();
        List<LocationDao> locationDaoList = (List<LocationDao>) locationRepository.findAll();
        for (LocationDao loc : locationDaoList){
            locationList.add(convertToPojo(loc));
        }
        return locationList;
    }

    private Location convertToPojo(LocationDao locationDao){
        return new Location(locationDao.getLocCode(), locationDao.getArea());
    }
}
