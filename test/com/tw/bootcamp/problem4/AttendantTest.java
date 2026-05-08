package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttendantTest {
    @Test
    void attendantShouldBeAbleToParkACar() {
        Car c1 = new Car("c1");
        ParkingLot parkingLot = new ParkingLot(3);
        Attendant attendant = new Attendant(parkingLot);
        assertTrue(attendant.parkCar(c1));
    }
}
