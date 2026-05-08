package com.tw.bootcamp.problem3;

import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;

import java.util.Objects;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    public static Length ofInch(double value) throws InvalidMeasureValue {
        return  ofCentimeter(value * 2.5);
    }

    public static Length ofFeet(double value) throws InvalidMeasureValue {
        return ofInch(value * 12);
    }

    public static Length ofCentimeter(double value) throws InvalidMeasureValue {
        if(value < 0) throw new InvalidMeasureValue("Length can't be negative");
        return new Length(value);
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
        return Length.ofCentimeter(o.value + value);
    }
}