package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldCalculateSquareFindArea() {
        Square square = new Square(4);
        double area = square.findArea();
        assertEquals(16, area);
    }

    @Test
    void shouldCalculateFindPerimeter() {
        Square square = new Square(4);
        double perimeter = square.findPerimeter();
        assertEquals(16, perimeter);
    }
}
