package dev.christianbaumann.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTests {

    private Client client = new Client(6, 4, 3);

    @Test
    void calculatesSquareArea() {
        // Arrange
        Shape shape = Shape.SQUARE;

        // Act
        double result = client.calculateArea(shape);

        // Assert
        assertEquals(36, result, 0);
    }

    @Test
    void calculatesSquarePerimeter() {
        // Arrange
        Shape shape = Shape.SQUARE;

        // Act
        double result = client.calculatePerimeter(shape);

        // Assert
        assertEquals(24, result, 0);
    }

    @Test
    void calculatesRectangleArea() {
        // Arrange
        Shape shape = Shape.RECTANGLE;

        // Act
        double result = client.calculateArea(shape);

        // Assert
        assertEquals(24, result, 0);
    }

    @Test
    void calculatesRectanglePerimeter() {
        // Arrange
        Shape shape = Shape.RECTANGLE;

        // Act
        double result = client.calculatePerimeter(shape);

        // Assert
        assertEquals(20, result, 0);
    }
}
