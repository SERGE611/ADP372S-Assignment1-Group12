///*  TruckServiceImplTest.java
//    Test class for TruckServiceImpl
//    Author: Alan Chapman(220092362)
//    Date: 11 June 2023
//*/
//package za.ac.cput.vehicledealership.service;
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import za.ac.cput.vehicledealership.domain.*;
//import za.ac.cput.vehicledealership.factory.TruckFactory;
//import za.ac.cput.vehicledealership.service.impl.TruckServiceImpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//@Disabled
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class TruckServiceImplTest {
//
//    @Autowired
//    private TruckServiceImpl truckService;
//    private static Truck truck = TruckFactory.createTruck("Mercedes Benz", "Actros", VehicleCondition.USED, FuelType.DIESEL,"red",
//            2023, 1006, 6, 13607.8);
//
//    @Order(1)
//    @Test
//    void create() {
//        Truck createdTruck= truckService.create(truck);
//        assertNotNull(createdTruck);
//        System.out.println("Create: " + createdTruck);
//    }
//
//    @Order(2)
//    @Test
//    void read() {
//        Truck readTruck = truckService.read(truck.getVehicleId());
//        assertNotNull(readTruck);
//        System.out.println("Read: " + readTruck);
//    }
//
//    @Order(3)
//    @Test
//    void update() {
//        Truck updatedTruck = new Truck.TruckBuilder()
//                .copy(truck)
//                .setCondition(VehicleCondition.NEW)
//                .setColour("White")
//                .build();
//
//        assertNotNull(truckService.update(updatedTruck));
//        System.out.println("Update: " + updatedTruck);
//    }
//
//    @Order(5)
//    @Test
//    void delete() {
//        boolean success = truckService.delete(truck.getVehicleId());
//
//        assertTrue(success);
//        System.out.println("Delete: " + success);
//    }
//
//    @Order(4)
//    @Test
//    void getAll() {
//        System.out.println("Get all: ");
//        System.out.println(truckService.getAll());
//        assertEquals(1, truckService.getAll().size());
//    }
//}