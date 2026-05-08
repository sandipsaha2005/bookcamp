package com.tw.bootcamp.problem4;

public class Attendant {
    private final ParkingLot parkingLot;

    public Attendant(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }


    public boolean parkCar(Car car) {
        return parkingLot.park(car);
    }
}
