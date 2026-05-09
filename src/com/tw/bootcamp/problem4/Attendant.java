package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;

public class Attendant {
    private final Map<String, ParkingLot> registry;

    public Attendant() {
        this.registry = new HashMap<>();
    }

    public String createParkingLot(String id, int capacity) {
        registry.putIfAbsent(id, new ParkingLot(capacity));
        return id;
    }

    public boolean parkCar(String parkingLotId, Car car) {
        ParkingLot parkingLot = registry.get(parkingLotId);
        if (parkingLot.isFull()) return false;
        return parkingLot.park(car);
    }

}
