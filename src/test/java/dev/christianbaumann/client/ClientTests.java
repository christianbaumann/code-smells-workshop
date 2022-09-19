package dev.christianbaumann.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTests {

    private Client client = new Client(6,4, 3);

    @Test
    public void squareArea() {
        assertEquals(36, client.calculateArea(Shape.SQUARE), 0);
    }

    @Test
    public void squarePerimeter() {
        assertEquals(24, client.calculatePerimeter(Shape.SQUARE), 0);
    }

    @Test
    public void rectangleArea() {
        assertEquals(24, client.calculateArea(Shape.RECTANGLE), 0);
    }

    @Test
    public void rectanglePerimeter() {
        assertEquals(20, client.calculatePerimeter(Shape.RECTANGLE), 0);
    }
}
