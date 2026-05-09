package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;

public class Assistant {
    private final Map<String, Integer> parkingLots;

    public Assistant() {
        this.parkingLots = new HashMap<>();
    }


    public String createParkingLot(String parkingLot, int capacity) {
        parkingLots.put(parkingLot, capacity);
        return parkingLot;
    }

    public Integer updateAvailableSlots(String parkingLot) {
        return parkingLots.compute(parkingLot , (k, availableSlots) -> availableSlots - 1);
    }
}
