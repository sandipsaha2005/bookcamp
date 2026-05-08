package com.tw.bootcamp.problem3;

import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;

import java.util.Objects;

public class Volume {
    private final double value;

    private Volume(double value) {
        this.value = value;
    }

    public static Volume of(double value, VolumeUnits unit) throws InvalidMeasureValue {
        if(value < 0) throw new InvalidMeasureValue("Volume can't be negative");
        return new Volume(value * unit.toBase());

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;

        return Math.abs(value - volume.value) <= 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                '}';
    }

    public Volume add(Volume o) throws InvalidMeasureValue {
        return of(value + o.value, VolumeUnits.LITER);
    }
}
