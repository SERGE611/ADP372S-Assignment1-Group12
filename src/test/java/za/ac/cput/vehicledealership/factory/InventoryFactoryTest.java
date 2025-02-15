//package za.ac.cput.vehicledealership.factory;
///* InventoryFactoryTest.java
//    Test class for Inventory
//    Author: Kimoki Serge Kalala (220525137)
//    Date: 07 April 2023
//*/
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import za.ac.cput.vehicledealership.domain.*;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//@Disabled
//class InventoryFactoryTest {
//
//    @Test
//    void createInventoryFactoryaSuccess() {
//        Vehicle vehicle = VehicleFactory.createVehicle("Audi", "A4", VehicleCondition.USED, FuelType.PETROL, "White", 2019, 23000);
//
//        Inventory inventory= InventoryFactory.createInventoryFactory(43, InventoryType.USED_INVENTORY,vehicle);
//        System.out.println(inventory);
//        assertNotNull(inventory);
//
//
//    }
//    @Test
//    void createInventoryFactoryFail() {
//
//        Vehicle vehicle = VehicleFactory.createVehicle("Audi", "A4", VehicleCondition.USED, FuelType.PETROL, "White", 2019, 23000);
//
//        Inventory inventory=InventoryFactory.createInventoryFactory(43,InventoryType.DEMO_INVENTORY,vehicle);
//
//        assertNull(inventory);
//    }
//}