package code.with.vanilson.algorithms.search;

/**
 * BinarySearchBS
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-03
 */
public class BinarySearchBS {

    public static void main(String[] args) {
        int[] number =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95,
                        100};
        int target = 5;
        long startTime = System.currentTimeMillis();
        int result = binarySearch(number, target);

        if (result == 1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Time taken: " + duration + " milliseconds");

    }

    public static int binarySearch(int[] number, int target) {
        // check if the array is empty
        if (number.length == 0) {
            return -1;
        }
        // set the left and right bounds of the array to search for the target element in the array.
        int left = 0;
        int right = number.length - 1;
        // loop through the array to find the target element in the array.
        while (left <= right) {
            // calculate the mid-point of the array to check if the target element is in the left or right side of the array.
            int mid = (left + right) / 2;

            // check if the target element is equal to the mid-element of the array.
            if (number[mid] == target) {
                return mid; // return the index of the target element in the array.
                // check if the target element is less than the mid-element of the array.
            } else if (number[mid] < target) {
                left = mid + 1; // set the left bound to the mid + 1.
                // check if the target element is greater than the mid-element of the array.
            } else {
                right = mid - 1; // set the right bound to the mid - 1.
            }
        }

        return -1; // return -1 if the target element is not found in the array.
    }
}