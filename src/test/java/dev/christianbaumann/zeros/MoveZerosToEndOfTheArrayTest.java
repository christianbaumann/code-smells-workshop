package dev.christianbaumann.zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosToEndOfTheArrayTest {

    @Test
    void keepsOnlyZeros() {
        // Arrange
        int[] input = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void keepsAllNonZeros() {
        // Arrange
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void movesZerosToEnd() {
        // Arrange
        int[] input = {0, 1, 0, 3, 4, 0, 5};
        int[] expected = {1, 3, 4, 5, 0, 0, 0};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void handlesEmptyArray() {
        // Arrange
        int[] input = {};
        int[] expected = {};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void handlesOnlyNonZeros() {
        // Arrange
        int[] input = {5, 8, 6, 2};
        int[] expected = {5, 8, 6, 2};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void handlesSingleZero() {
        // Arrange
        int[] input = {0};
        int[] expected = {0};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void handlesSingleNonZero() {
        // Arrange
        int[] input = {7};
        int[] expected = {7};

        // Act
        int[] result = MoveZerosToEndOfTheArray.removeZeros(input);

        // Assert
        assertArrayEquals(expected, result);
    }
}
