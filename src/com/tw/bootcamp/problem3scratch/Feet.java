package com.tw.bootcamp.problem3scratch;

public class Feet implements Length {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public static Feet of(double value) throws InvalidMeasureValue {
        if(value < 0) {
            throw new InvalidMeasureValue("Length Can't be negative value");
        }

        return new Feet(value);
    }

    @Override
    public Centimeter convertToBase() {
        return new Centimeter(value * 30);
    }
}
