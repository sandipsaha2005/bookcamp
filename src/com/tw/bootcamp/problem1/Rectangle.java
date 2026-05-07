package com.tw.bootcamp.problem1;

public class Rectangle  {
    private final double length;
    private final double width;

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public static Rectangle createRectangle(double length, double width) {
        if(length < 0 || width < 0) {
            throw new IllegalArgumentException("Negative Values Are Not Allowed");
        }
        return new Rectangle(length, width);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }


    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
}
