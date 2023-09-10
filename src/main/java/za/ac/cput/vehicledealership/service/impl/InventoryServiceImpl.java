package za.ac.cput.vehicledealership.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import za.ac.cput.vehicledealership.domain.Inventory;
import za.ac.cput.vehicledealership.domain.Vehicle;
import za.ac.cput.vehicledealership.factory.InventoryFactory;
import za.ac.cput.vehicledealership.repository.InventoryRepository;
import za.ac.cput.vehicledealership.repository.VehicleRepository;
import za.ac.cput.vehicledealership.service.InventoryService;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {


    private final InventoryRepository inventoryRepository;
    private final VehicleRepository vehicleRepository;
    @Override
    public Inventory create(Inventory type) {
        Vehicle vehicle=vehicleRepository.getById(type.getInventoryId());
        Inventory inventory= InventoryFactory.createInventoryFactory(type.getQuantity(),type.getInventoryType(),vehicle);

        return  inventoryRepository.save(inventory);
    }

    @Override
    public Inventory read(String s) {
        Inventory inventory=inventoryRepository.getById(s);
        return inventory;
    }

    @Override
    public Inventory update(Inventory type) {
        Vehicle vehicle=vehicleRepository.getById(type.getVehicle().getVehicleId());
        Inventory inventory= InventoryFactory.updateInventoryFactorywithid(type.getInventoryId(),type.getQuantity(),type.getInventoryType(),vehicle);
        return  inventoryRepository.save(inventory);
    }

    @Override
    public boolean delete(String s) {

        return inventoryRepository.existsById(s) ;
    }

    @Override
    public List<Inventory> getAll() {
        List<Inventory> getAll=inventoryRepository.findAll();
        //getAll.stream().filter(inventory -> inventory.getInventoryType().equals(search)).collect(Collectors.toList());
        return getAll;
    }


}
