package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void shouldCompareFeetAndInches() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);
        assertEquals(feet.convertToBase(), inch.convertToBase());
    }

    @Test
    void shouldCompareInchAndCentimeter() {
        Centimeter cen = new Centimeter(5);
        Inch inch = new Inch(2);
        assertEquals(cen.convertToBase(), inch.convertToBase());
    }

    @Test
    void shouldCompareMillimeterAndCentimeter() {
        Centimeter cen = new Centimeter(1);
        Millimeter millimeter = new Millimeter(10);
        assertEquals(cen.convertToBase(), millimeter.convertToBase());
    }
}
