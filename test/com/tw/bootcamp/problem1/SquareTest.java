package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldCalculateSquareFindArea() {
        Rectangle square = Rectangle.createSquare(4);
        double area = square.calculateArea();
        assertEquals(16, area);
    }



    @Test
    void shouldCalculateFindPerimeter() {
        Rectangle square = Rectangle.createSquare(4);
        double perimeter = square.calculatePerimeter();
        assertEquals(16, perimeter);
    }
}
