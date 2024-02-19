// package com.dbmsproject.business;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.dbmsproject.dao.SlotTypeDao;
// import com.dbmsproject.models.SlotType;
// import com.dbmsproject.repositories.SlotTypeRepository;

// public class SlotTypeService {
//     @Autowired
//     private SlotTypeRepository slotTypeRepository;
    
//     public List<SlotTypeDao> getSlotTypes(int locCode) {
//         List<SlotTypeDao> slotTypes = new ArrayList<>();
//         Iterator<SlotTypeDao> iterator = slotTypeRepository.findAll().iterator();

//         while(iterator.hasNext()){
//             slotTypes.add(convertToPojo(iterator.next()));
//         }
//         return slotTypes;
//     }

//     private SlotType convertToPojo(SlotTypeDao slotTypeDao){
//         return new SlotType(slotTypeDao.getSlotTypeId(), slotTypeDao.getVehType());
//     }
// }
