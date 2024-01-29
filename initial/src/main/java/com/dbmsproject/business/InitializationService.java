package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.repositories.FaresRepository;
import com.dbmsproject.repositories.LocationRepository;
import com.dbmsproject.repositories.SlotTypeRepository;

@Service
public class InitializationService {
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private SlotTypeRepository slotTypeRepository;

    @Autowired
    private FaresRepository faresRepository;

    public void initialize(){
        initLocation();
        initSlotTypes();
        initFares();
    }

    private void initLocation(){
        LocationRepository.save(new LocationDao());
    }

    private void initSlotTypes(){
        LocationRepository.save(new SlotTypeDao());
    }

    private void initFares(){
        LocationRepository.save(new FaresDao());
    }
}
