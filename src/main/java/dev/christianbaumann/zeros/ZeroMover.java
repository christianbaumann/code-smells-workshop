package dev.christianbaumann.zeros;

/**
 * Moves zeros in an array to the end.
 */
public class ZeroMover {

    /**
     * Moves all zeros to the end of the array.
     *
     * @param array The array to modify.
     * @return The modified array with zeros moved to the end.
     */
    public static int[] moveZerosToEnd(int[] array) {
        if (array == null || array.length == 0) {
            return array; // Return the original array for null or empty cases.
        }

        int nonZeroIndex = 0; // Pointer to keep track of the position for non-zero elements

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] != 0) {
                swap(array, currentIndex, nonZeroIndex);
                nonZeroIndex++;
            }
        }

        return array;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param array      The array.
     * @param firstIndex First index.
     * @param secondIndex Second index.
     */
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) { // Avoid unnecessary swaps
            int temporary = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temporary;
        }
    }

    /**
     * Main method.
     *
     * @param arguments Command line arguments.
     */
    public static void main(String[] arguments) {
        int[] array = {1, 0, 3, 4, 0, 4};
        moveZerosToEnd(array);

        // Print the modified array
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
