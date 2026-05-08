package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CarTest {
    @Test
    void shouldCreateCarObject() {
        Car c1 = new Car("c1");

        assertEquals("c1", c1.id());
    }
}
