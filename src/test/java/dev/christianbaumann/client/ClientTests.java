package dev.christianbaumann.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTests {

    private Client client = new Client(6,4, 3);

    @Test
    void squareArea() {
        assertEquals(36, client.calculateArea(Shape.SQUARE), 0);
    }

    @Test
    void squarePerimeter() {
        assertEquals(24, client.calculatePerimeter(Shape.SQUARE), 0);
    }

    @Test
    void rectangleArea() {
        assertEquals(24, client.calculateArea(Shape.RECTANGLE), 0);
    }

    @Test
    void rectanglePerimeter() {
        assertEquals(20, client.calculatePerimeter(Shape.RECTANGLE), 0);
    }
}
