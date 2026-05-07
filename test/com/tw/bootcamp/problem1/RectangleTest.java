package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = Rectangle.createRectangle(2, 2);
        double area = rectangle.calculateArea();
        assertEquals(4, area);
    }


    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(14, perimeter);
    }

    @Test
    void shouldThrowErrorIfNegativeValuesAreGiven() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.createRectangle(-3, 4);
        });
        assertEquals("Negative Values Are Not Allowed",exception.getMessage());
    }
}