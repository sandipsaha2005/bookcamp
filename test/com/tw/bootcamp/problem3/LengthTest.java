package com.tw.bootcamp.problem3;
import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void shouldCreateUnitWithInch() throws InvalidMeasureValue {
        Length inch = Length.ofInch(1);
        assertEquals(Length.ofInch(1), inch);
    }

    @Test
    void shouldCreateUnitWithFeet() throws InvalidMeasureValue {
        Length feet = Length.ofFeet(2);
        assertEquals(Length.ofFeet(2), feet);
    }

    @Test
    void shouldCreateUnitWithCentimeter() throws InvalidMeasureValue {
        Length centimeter = Length.ofCentimeter(1);
        assertEquals(Length.ofCentimeter(1), centimeter);
    }

    @Test
    void shouldThrowErrorIfNegativeValueIsGivenAsLength() {
        InvalidMeasureValue invalidMeasureValue = assertThrows(InvalidMeasureValue.class, () -> Length.ofCentimeter(-1));
        assertEquals("Length can't be negative", invalidMeasureValue.getMessage());
    }

    @Test
    void shouldBeAbleToAddToInches() throws InvalidMeasureValue {
        Length inch1 = Length.ofInch(2);
        Length inch2 = Length.ofInch(2);
        Length sum = inch1.add(inch2);

        assertEquals(Length.ofInch(4), sum);
    }
}