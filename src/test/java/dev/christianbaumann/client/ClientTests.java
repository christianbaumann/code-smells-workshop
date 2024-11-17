package dev.christianbaumann.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTests {

    private Client client = new Client(6, 4, 3);

    @Test
    void squareArea() {
        // Arrange
        Shape shape = Shape.SQUARE;

        // Act
        double result = client.calculateArea(shape);

        // Assert
        assertEquals(36, result, 0);
    }

    @Test
    void squarePerimeter() {
        // Arrange
        Shape shape = Shape.SQUARE;

        // Act
        double result = client.calculatePerimeter(shape);

        // Assert
        assertEquals(24, result, 0);
    }

    @Test
    void rectangleArea() {
        // Arrange
        Shape shape = Shape.RECTANGLE;

        // Act
        double result = client.calculateArea(shape);

        // Assert
        assertEquals(24, result, 0);
    }

    @Test
    void rectanglePerimeter() {
        // Arrange
        Shape shape = Shape.RECTANGLE;

        // Act
        double result = client.calculatePerimeter(shape);

        // Assert
        assertEquals(20, result, 0);
    }
}
