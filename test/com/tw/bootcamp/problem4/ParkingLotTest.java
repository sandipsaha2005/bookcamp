package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldBeAbleToParkCar() {
        ParkingLot parkingLot = new ParkingLot(3);
        assertTrue(parkingLot.park(new Car("c1")));
    }

    @Test
    void shouldNotifyFalseIfParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(3);
        assertFalse(parkingLot.isFull());
    }

    @Test
    void shouldNotifyTrueIfParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(0);
        assertTrue(parkingLot.isFull());
    }
}
