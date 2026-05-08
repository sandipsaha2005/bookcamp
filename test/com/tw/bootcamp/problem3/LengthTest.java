package com.tw.bootcamp.problem3;
import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void shouldCreateUnitWithInch() throws InvalidMeasureValue {
        Length inch = Length.of(1, LengthUnits.INCH);
        assertEquals(Length.of(1, LengthUnits.INCH), inch);
    }

    @Test
    void shouldCreateUnitWithFeet() throws InvalidMeasureValue {
        Length feet = Length.of(2, LengthUnits.FEET);
        assertEquals(Length.of(2, LengthUnits.FEET), feet);
    }

    @Test
    void shouldCreateUnitWithCentimeter() throws InvalidMeasureValue {
        Length centimeter = Length.of(1, LengthUnits.CM);
        assertEquals(Length.of(1, LengthUnits.CM), centimeter);
    }

    @Test
    void shouldThrowErrorIfNegativeValueIsGivenAsLength() {
        InvalidMeasureValue invalidMeasureValue = assertThrows(InvalidMeasureValue.class, () -> Length.of(-1, LengthUnits.CM));
        assertEquals("Length can't be negative", invalidMeasureValue.getMessage());
    }

    @Test
    void shouldBeAbleToAddToInches() throws InvalidMeasureValue {
        Length inch1 = Length.of(2, LengthUnits.INCH);
        Length inch2 = Length.of(2, LengthUnits.INCH);
        Length sum = inch1.add(inch2);

        assertEquals(Length.of(4, LengthUnits.INCH), sum);
    }

    @Test
    void shouldBeAbleToAddInchAndCm() throws InvalidMeasureValue {
        Length inch = Length.of(2, LengthUnits.INCH);
        Length cm = Length.of(2.5, LengthUnits.CM);
        Length sum = inch.add(cm);

        assertEquals(Length.of(3, LengthUnits.INCH), sum);

    }
}