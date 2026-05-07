package com.tw.bootcamp.problem1;

public class Rectangle implements Quadrilaterals {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double findArea() {
        return length * width;
    }
}
