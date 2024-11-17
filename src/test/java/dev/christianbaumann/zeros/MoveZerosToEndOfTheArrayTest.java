package dev.christianbaumann.zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosToEndOfTheArrayTest {

    @Test
    void allZeros() {
        int[] input = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void noZeros() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void mixedZerosAndNonZeros() {
        int[] input = {0, 1, 0, 3, 4, 0, 5};
        int[] expected = {1, 3, 4, 5, 0, 0, 0};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void emptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void allNonZeros() {
        int[] input = {5, 8, 6, 2};
        int[] expected = {5, 8, 6, 2};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void singleZero() {
        int[] input = {0};
        int[] expected = {0};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }

    @Test
    void singleNonZero() {
        int[] input = {7};
        int[] expected = {7};
        assertArrayEquals(expected, MoveZerosToEndOfTheArray.removeZeros(input));
    }
}
