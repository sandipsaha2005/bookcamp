package com.tw.bootcamp.problem1;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double findArea() {
        return length * breadth;
    }

    public double findPerimeter() {
        return 2 * (length + breadth);
    }
}
