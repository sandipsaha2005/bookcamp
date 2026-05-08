package com.tw.bootcamp.problem3;

public enum TemperatureUnit {
    CELSIUS {
        @Override
        public double toCelsius(double value) {
            return value;
        }
    },

    FAHRENHEIT {
        @Override
        public double toCelsius(double value) {
            return (value - 32) * 5 / 9;
        }
    };

    public abstract double toCelsius(double value);
}
