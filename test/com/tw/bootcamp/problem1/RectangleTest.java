package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2, 2);
        int area = rectangle.findArea();
        assertEquals(4, area);
    }

}