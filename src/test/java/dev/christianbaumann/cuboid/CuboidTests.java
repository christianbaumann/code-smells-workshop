package dev.christianbaumann.cuboid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuboidTests {

    @Test
    void calculatesArea() {
        // Arrange
        Cuboid testCuboid = new Cuboid(6, 4, 3);

        // Act
        double area = testCuboid.calculateArea();

        // Assert
        assertEquals(108, area, 0);
    }
}
