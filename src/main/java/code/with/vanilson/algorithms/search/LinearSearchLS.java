package code.with.vanilson.algorithms.search;

/**
 * LinearSearchLS
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-03
 */
public class LinearSearchLS {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = linearSearch(number, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int linearSearch(int[] number, int target) {
        // check if the array is empty or not.
        if (number.length == 0) {
            return -1;
        }
        // loop through the array to find the target element in the array.
        for (int i = 0; i < number.length; i++) {
            // check if the target element is equal to the current element in the array.
            if (number[i] == target) {
                return i; // return the index of the target element in the array.
            }
        }
        return -1; // return -1 if the target element is not found in the array.
    }

}