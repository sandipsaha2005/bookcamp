package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {
    @Test
    void shouldCompareFahrenheitAndCelsius() {
        Temperature fahrenheit = Temperature.of(212, TemperatureUnit.FAHRENHEIT);
        Temperature celsius = Temperature.of(100, TemperatureUnit.CELSIUS);
        assertEquals(fahrenheit, celsius);
    }
}
