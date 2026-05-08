package com.tw.bootcamp.problem3;

public class Feet implements Unit {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value * 30);
    }
}
