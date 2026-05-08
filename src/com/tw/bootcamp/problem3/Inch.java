package com.tw.bootcamp.problem3;

public class Inch implements Unit {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value * 2.5);
    }
}
