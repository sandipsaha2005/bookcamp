package com.tw.bootcamp.problem3scratch;

import java.util.Objects;

public class Centimeter implements Length {
    private final double value;

    public Centimeter(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
