package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Unit {
    private final double value;

    private Unit(double value) {
        this.value = value;
    }

    public static Unit ofInch(double value) {
        return  ofCentimeter(value * 2.5);
    }

    public static Unit ofFeet(double value) {
        return ofInch(value * 12);
    }

    public static Unit ofCentimeter(double value) {
        return new Unit(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Double.compare(value, unit.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
