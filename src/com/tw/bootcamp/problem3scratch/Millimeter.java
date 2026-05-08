package com.tw.bootcamp.problem3scratch;

public class Millimeter implements Length {
    private final double value;

    public Millimeter(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value / 10);
    }
}
