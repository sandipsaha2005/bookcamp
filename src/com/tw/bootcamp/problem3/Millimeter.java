package com.tw.bootcamp.problem3;

public class Millimeter implements Unit {
    private final double value;

    public Millimeter(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value / 10);
    }
}
