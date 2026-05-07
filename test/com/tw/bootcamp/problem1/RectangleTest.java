package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2, 2);
        double area = rectangle.findArea();
        assertEquals(4, area);
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);
        double perimeter = rectangle.findPerimeter();
        assertEquals(14,perimeter);
    }
}