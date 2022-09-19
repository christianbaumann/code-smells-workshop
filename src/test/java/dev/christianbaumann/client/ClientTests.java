package dev.christianbaumann.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTests {

    private Client square = new Client(new Square(6));
    private Client rectangle = new Client(new Rectangle(6, 4));

    @Test
    public void squareArea() {
        assertEquals(36, square.calculateArea(), 0);
    }

    @Test
    public void squarePerimeter() {
        assertEquals(24, square.calculatePerimeter(), 0);
    }

    @Test
    public void rectangleArea() {
        assertEquals(24, rectangle.calculateArea(), 0);
    }

    @Test
    public void rectanglePerimeter() {
        assertEquals(20, rectangle.calculatePerimeter(), 0);
    }
}
