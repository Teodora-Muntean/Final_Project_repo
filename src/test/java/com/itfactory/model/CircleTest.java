package com.itfactory.model;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class CircleTest {
    private Circle circle;

    @Test
    public void testCalculatePerimeter() {
        circle = new Circle(10);
        double perimeter = circle.calculatePerimeter();
        assertEquals(62.83185307179586,perimeter);
    }
}
