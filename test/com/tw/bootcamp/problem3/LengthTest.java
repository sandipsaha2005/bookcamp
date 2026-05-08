package com.tw.bootcamp.problem3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void shouldCreateUnitWithInch() {
        Length inch = Length.ofInch(1);
        assertEquals(Length.ofInch(1), inch);
    }

    @Test
    void shouldCreateUnitWithFeet() {
        Length feet = Length.ofFeet(2);
        assertEquals(Length.ofFeet(2), feet);
    }

    @Test
    void shouldCreateUnitWithCentimeter() {
        Length centimeter = Length.ofCentimeter(1);
        assertEquals(Length.ofCentimeter(1), centimeter);
    }
}