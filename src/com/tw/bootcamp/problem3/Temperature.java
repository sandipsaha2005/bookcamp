package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Temperature {
    private final double value;

    public Temperature(double value) {
        this.value = value;
    }

    public static Temperature of(double value, TemperatureUnit unit) {
        return new Temperature(unit.toCelsius(value));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
