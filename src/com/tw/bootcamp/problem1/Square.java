package com.tw.bootcamp.problem1;

public class Square implements Quadrilaterals {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findPerimeter() {
        return 4 * side;
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
