package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssistantTest {

    @Test
    void shouldCreateParkingLot() {
        Assistant assistant = new Assistant();
        String parkingLot = assistant.createParkingLot("p1", 2);
        assertEquals("p1",parkingLot);
    }

    @Test
    void shouldUpdateStatusOfParkingLot() {
        Assistant assistant = new Assistant();
        String parkingLot = assistant.createParkingLot("p1", 2);
        assistant.updateAvailableSlots("p1");
    }
}
