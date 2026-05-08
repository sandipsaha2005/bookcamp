package com.tw.bootcamp.problem3;

import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;

import java.util.Objects;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    public static Length of(double value, LengthUnits unit) throws InvalidMeasureValue {
        if (value < 0) throw new InvalidMeasureValue("Length can't be negative");

        return new Length(value * unit.toBase());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length unit = (Length) o;
        return Double.compare(value, unit.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Length add(Length o) throws InvalidMeasureValue {
        return Length.of(o.value + value, LengthUnits.CM);
    }
}