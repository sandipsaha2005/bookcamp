package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    public static Length ofInch(double value) {
        return  ofCentimeter(value * 2.5);
    }

    public static Length ofFeet(double value) {
        return ofInch(value * 12);
    }

    public static Length ofCentimeter(double value) {
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
}