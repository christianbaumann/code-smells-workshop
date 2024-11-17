package dev.christianbaumann.zeros;

/**
 * This class provides a method to move all zeros to the end of an integer array.
 */
public class MoveZerosToEndOfTheArray {

    /**
     * Moves all zeros to the end of the given array.
     *
     * This method takes an integer array arr as input and modifies it by moving all zeros to the end.
     * It initializes a pointer j to keep track of the position where non-zero elements will be placed.
     * It iterates through the array arr using a for loop.
     * If the current element is non-zero and the element at position j is zero,
     * it swaps the non-zero element with the zero element.
     * If the element at position j is non-zero, it increments j.
     * Finally, it returns the modified array.
     *
     * @param arr The integer array to be modified.
     * @return The modified array with zeros moved to the end.
     */
    public static int[] removeZeros(int[] arr) {
        int j = 0; // Pointer to keep track of the position where non-zero elements will be placed
        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero and the element at j position is zero
            if (arr[i] != 0 && arr[j] == 0) {
                // Swap the non-zero element with the element at j position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            // If the element at j position is non-zero, increment j
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    /**
     * Main method to demonstrate the functionality of the moveZeros method.
     *
     * This method is the entry point of the program.
     * It creates an integer array arr with some sample values.
     * It calls the removeZeros method to move zeros to the end of the array.
     * It prints the modified array to the console.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0, 4};
        // Call the removeZeros method to move zeros to the end
        int[] modifiedArray = removeZeros(arr);
        // Print the modified array
        for (int e : modifiedArray) {
            System.out.print(e + " ");
        }
    }
}