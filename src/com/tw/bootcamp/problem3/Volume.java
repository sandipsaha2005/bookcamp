package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
    private final double value;

    private Volume(double value) {
        this.value = value;
    }

    public static Volume ofGallon(double value) {
        return ofLiter(value * 3.78);
    }

    public static Volume ofLiter(double value) {
        return new Volume(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(value, volume.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
