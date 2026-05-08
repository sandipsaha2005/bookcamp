package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int capacity;
    private final List<Car> storage;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        storage = new ArrayList<>();
    }


    public boolean park(Car car) {
        return storage.add(car);
    }

    public boolean isFull() {
        return storage.size() == capacity;
    }
}
