package com.itfactory.model;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @Test
    public void testCalculatePerimeter() {
        triangle = new Triangle(5.6, 9.4, 11.5);
        double perimeter = triangle.calculatePerimeter();
        assertEquals(26.5, perimeter);
    }
}
