package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.dao.LocationDao;
import com.dbmsproject.dao.ParkingLotCapacityDao;
import com.dbmsproject.dao.UserDao;
import com.dbmsproject.dao.SlotTypeDao;
import com.dbmsproject.repositories.FaresRepository;
import com.dbmsproject.repositories.LocationRepository;
import com.dbmsproject.repositories.ParkingLotCapacityRepository;
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

    @Autowired
    private ParkingLotCapacityRepository parkingLotCapacityRepository;

    public void initialize(){
        initLogin();
        initLocation();
        initSlotTypes();
        initFares();
        initParkingLotCapacities();
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

    private void initParkingLotCapacities(){
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(1, 1, 1, 1, 3));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(2, 1, 2, 1, 20));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(3, 1, 1, 2, 2));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(4, 1, 2, 2, 30));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(5, 2, 1, 1, 40));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(6, 2, 2, 1, 60));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(7, 2, 1, 2, 20));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(8, 2, 2, 2, 30));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(9, 3, 1, 1, 10));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(10, 3, 2, 1, 40));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(11, 4, 1, 1, 50));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(12, 4, 2, 1, 20));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(13, 4, 1, 2, 35));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(14, 4, 2, 2, 12));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(15, 4, 1, 3, 3));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(16, 4, 2, 3, 40));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(17, 5, 1, 1, 25));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(18, 5, 2, 1, 34));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(19, 5, 1, 2, 10));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(20, 5, 2, 2, 10));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(21, 5, 1, 3, 10));
        parkingLotCapacityRepository.save(new ParkingLotCapacityDao(22, 5, 2, 3, 10));
    }
}
