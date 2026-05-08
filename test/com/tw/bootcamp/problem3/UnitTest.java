package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    @Test
    void shouldCreateUnitWithInch() {
        Unit inch = Unit.ofInch(12);
        assertEquals(Unit.ofInch(12), inch);
    }

    @Test
    void shouldCreateUnitWithFeet() {
        Unit feet = Unit.ofFeet(2);
        assertEquals(Unit.ofFeet(2), feet);
    }

    @Test
    void shouldCreateUnitWithCentimeter() {
        Unit centimeter = Unit.ofCentimeter(1);
        assertEquals(Unit.ofCentimeter(1), centimeter);
    }

    @Test
    void shouldBeEqualFor2InchAnd5Centimeter() {
        Unit inch = Unit.ofInch(2);
        Unit cem = Unit.ofCentimeter(5);
        assertEquals(inch, cem);
    }

    @Test
    void shouldBeEqualFor1FeetAnd12Inch() {
        Unit inch = Unit.ofInch(12);
        Unit feet = Unit.ofFeet(1);
        assertEquals(inch, feet);
    }
}
