package com.dbmsproject.business;

import java.util.ArrayList;
import java.util.Iterator;
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

    public List<Location> getParkingLots() {
        List<Location> parkingLots = new ArrayList<>();
        Iterator<LocationDao> iterator = locationRepository.findAll().iterator();
        while(iterator.hasNext()){
            parkingLots.add(convertToPojo(iterator.next()));
        }
        return parkingLots;
    }

    private Location convertToPojo(LocationDao parkingLotDao){
        return new Location(parkingLotDao.getLocCode(), parkingLotDao.getArea());
    }
}
