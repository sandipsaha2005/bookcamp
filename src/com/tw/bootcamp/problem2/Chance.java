package com.tw.bootcamp.problem2;

import java.util.Objects;

public final class Chance {
    private final double possibility;

    private Chance(double possibility) {
        this.possibility = possibility;
    }

    public Chance not() {
        return new Chance(1 - possibility);
    }

    public Chance and(Chance o) {
        return new Chance(o.possibility * possibility);
    }

    public Chance or(Chance o) {
        return (this.not().and( o.not())).not();
    }

    public static Chance of(double value) {
        if (value < 0 || value > 1) throw new IllegalArgumentException("Chance should be between 0 to 1");
        return new Chance(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(possibility, chance.possibility) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(possibility);
    }
}
