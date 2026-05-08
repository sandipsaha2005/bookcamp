package com.tw.bootcamp.problem3;

public enum VolumeUnits {
    LITER(1),
    GALLON(3.78);

    private final double value;

    VolumeUnits(double value) {
        this.value = value;
    }

    public double toBase() {
        return value;
    }
}
