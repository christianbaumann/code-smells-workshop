package dev.christianbaumann.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTests {

    private Client circle = new Client(6,4, 3);

    @Test
    public void squareArea() {
        assertEquals(36, circle.calculateArea(Shape.SQUARE), 0);
    }

    @Test
    public void squarePerimeter() {
        assertEquals(24, circle.calculatePerimeter(Shape.SQUARE), 0);
    }

    @Test
    public void rectangleArea() {
        assertEquals(24, circle.calculateArea(Shape.RECTANGLE), 0);
    }

    @Test
    public void rectanglePerimeter() {
        assertEquals(20, circle.calculatePerimeter(Shape.RECTANGLE), 0);
    }

    @Test
    public void circleArea() {
        assertEquals(28.27, circle.calculateArea(Shape.CIRCLE), 0.01);
    }

    @Test
    public void circlePerimeter() {
        assertEquals(18.84, circle.calculatePerimeter(Shape.CIRCLE), 0.01);
    }
}
