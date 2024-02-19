package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.dao.LocationDao;
import com.dbmsproject.dao.UserDao;
import com.dbmsproject.dao.SlotTypeDao;
import com.dbmsproject.repositories.FaresRepository;
import com.dbmsproject.repositories.LocationRepository;
import com.dbmsproject.repositories.UserRepository;
import com.dbmsproject.repositories.SlotTypeRepository;

@Service
public class InitializationService {
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private SlotTypeRepository slotTypeRepository;

    @Autowired
    private FaresRepository faresRepository;

    @Autowired
    private UserRepository userRepository;

    public void initialize(){
        initLogin();
        initLocation();
        initSlotTypes();
        initFares();
    }

    private void initLogin(){
        		
		
	
        userRepository.save(new UserDao("Praksh Sinha", 9046753640L, "prakash@123"));
        userRepository.save(new UserDao("Ria Dshpande", 7036559641L, "ria@123"));
        userRepository.save(new UserDao("Prerana Kiran", 6572435442L, "prakash@123"));
        userRepository.save(new UserDao("Ramesh M", 3546554231L, "prerana@123"));
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
        faresRepository.save(new FaresDao(1, new LocationDao(1), new SlotTypeDao(1), 30));
        faresRepository.save(new FaresDao(2, new LocationDao(1), new SlotTypeDao(2), 50));
        faresRepository.save(new FaresDao(3, new LocationDao(2), new SlotTypeDao(1), 20));
        faresRepository.save(new FaresDao(4, new LocationDao(2), new SlotTypeDao(2), 40));
        faresRepository.save(new FaresDao(5, new LocationDao(3), new SlotTypeDao(1), 40));
        faresRepository.save(new FaresDao(6, new LocationDao(3), new SlotTypeDao(2), 70));
        faresRepository.save(new FaresDao(7, new LocationDao(4), new SlotTypeDao(1), 20));
        faresRepository.save(new FaresDao(8, new LocationDao(4), new SlotTypeDao(2), 40));
        faresRepository.save(new FaresDao(9, new LocationDao(5), new SlotTypeDao(1), 30));
        faresRepository.save(new FaresDao(10, new LocationDao(5), new SlotTypeDao(2), 60));
    }
}
