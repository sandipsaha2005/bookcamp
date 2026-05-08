package com.tw.bootcamp.problem3;

public enum LengthUnits {
    CM(1),
    FEET(30),
    INCH(2.5),
    MILLI(0.1);

    private final double value;

    LengthUnits(double value) {
        this.value = value;
    }

    public double toBase() {
        return value;
    }
}
