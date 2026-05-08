package com.tw.bootcamp.problem3scratch;

public class Inch implements Length {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value * 2.5);
    }
}
