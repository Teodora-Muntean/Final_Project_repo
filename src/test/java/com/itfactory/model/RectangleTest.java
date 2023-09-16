package com.itfactory.model;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    private Rectangle rectangle;

    @Test
    public void testCalculatePerimeter() {
        rectangle = new Rectangle(4.5, 5.6);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(20.2, perimeter);
    }
}
