package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.dao.LocationDao;
import com.dbmsproject.dao.SlotTypeDao;
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
        locationRepository.save(new LocationDao(1, "Jayanagar", 2));
        locationRepository.save(new LocationDao(2, "Banashankari", 2));
        locationRepository.save(new LocationDao(3, "Koramangala", 1));
        locationRepository.save(new LocationDao(4, "Majestic", 3));
        locationRepository.save(new LocationDao(5, "Marathalli", 3));

    }

    private void initSlotTypes(){
        slotTypeRepository.save(new SlotTypeDao(1, 2));
        slotTypeRepository.save(new SlotTypeDao(2, 4));
    }

    private void initFares(){
        faresRepository.save(new FaresDao(new LocationDao(1), new SlotTypeDao(1), 30));
        faresRepository.save(new FaresDao(new LocationDao(1), new SlotTypeDao(2), 50));
        faresRepository.save(new FaresDao(new LocationDao(2), new SlotTypeDao(1), 20));
        faresRepository.save(new FaresDao(new LocationDao(2), new SlotTypeDao(2), 40));
        faresRepository.save(new FaresDao(new LocationDao(3), new SlotTypeDao(1), 40));
        faresRepository.save(new FaresDao(new LocationDao(3), new SlotTypeDao(2), 70));
        faresRepository.save(new FaresDao(new LocationDao(4), new SlotTypeDao(1), 20));
        faresRepository.save(new FaresDao(new LocationDao(4), new SlotTypeDao(2), 40));
        faresRepository.save(new FaresDao(new LocationDao(5), new SlotTypeDao(1), 30));
        faresRepository.save(new FaresDao(new LocationDao(5), new SlotTypeDao(2), 60));
    }
}
