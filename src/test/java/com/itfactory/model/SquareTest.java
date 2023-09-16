package com.itfactory.model;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class SquareTest {
    private Square square;

    @Test
    public void testCalculatePerimeter() {
        square = new Square(6.9);
        double perimeter = square.calculatePerimeter();
        assertEquals(27.6, perimeter);
    }
}
