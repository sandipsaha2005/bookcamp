package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParkingLotRegistryTest {
    ParkingLotRegistry registry;

    @BeforeEach
    void init() {
        registry = new ParkingLotRegistry();
    }

    @Test
    void shouldAddParkingLotIntoRegistry() {
        String parkingLotId = registry.createParkingLot("p1", 2);
        assertEquals("p1", parkingLotId);
    }

    @Test
    void shouldBeAbleAddCarIntoParkingLot() {
        String parkingLotId = registry.createParkingLot("p1", 2);
        assertEquals(true, registry.parkCar(parkingLotId, new Car("c1")));
    }

    @Test
    void shouldReturnFalseIfParkingLotIsFull() {
        String parkingLotId = registry.createParkingLot("p1", 0);
        assertEquals(false, registry.parkCar(parkingLotId, new Car("c1")));
    }

    @Test
    void shouldDisplayStateOfParkingLot() {
    }

    //    @Test
//    @Disabled
//    void shouldParkCarSmartly() {
//        registry.createParkingLot("p1", 2);
//        registry.createParkingLot("p2", 2);
//        registry.createParkingLot("p3", 2);
//        registry.smartPark(new Car("smart1"));
//        registry.smartPark(new Car("smart2"));
//        registry.smartPark(new Car("smart3"));
//    }
}
