package code.with.vanilson.datastructures.array;

import java.util.Arrays;

/**
 * Array
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-02
 */

//Array -> is a data structure that allows stores information of elements of a unique type and

public class Array {

    public static final String MS = " ms";

    public static void main(String[] args) {
        // Declaring an array
        // first type: primitive data: int, char,long,short,byte,float,double -> passing by value or object String,
        // wrapper class like Integer, Double, Float, Long, Object, Person, etc. passing by reference.
        //Array is an object
        int[] numbers = new int[10]; // type data ->[]->variable name -> passing new int[10] -- initiate a new array
        // object with size 10
        String[] names = new String[10];

        // Array is static. It means it has size.
        // How we see numbers is an array with size 10, it means to allocate on element 10.
        // Array is count start in zero

        int[] number = {12, 3, 4, 34, 56, 789, 3, 4, 12, 5, 6, 7, 18, 29, 8, 789, 7, 7, 100_00};
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("The result is: " + isValuePresentInArray(number, 5));
        System.out.println("The time taken is 1st: " + (endTime - startTime) + MS);

        long startTime_one = System.currentTimeMillis();
        System.out.println("The result is: " + isValuePresentInArray(number, 5));
        long endTime_one = System.currentTimeMillis();
        System.out.println("The time taken is 2nd: " + (endTime_one - startTime_one) + MS);

        System.out.println("Another exercise ");

        long startTime1 = System.currentTimeMillis();
        System.out.println("The number of time is : " + countOccurrencesInArray(number, 12));
        long endTime1 = System.currentTimeMillis();
        System.out.println("The total time is  first : " + (endTime1 - startTime1) + MS);

        System.out.println("The number of time using streams is : " +
                isValuePresentInArrayUsingStreams(number, 7));
        System.out.println("The time taken is seocnd : " + (endTime - startTime) + MS);
        System.out.println("The max value in array is: " + findMaxInArray(number));

        System.out.println("The min value in array is: " + findMinInArray(number));
        System.out.println("The time taken is the second: " + (endTime - startTime) + " ms");

        long startTime2 = System.currentTimeMillis();
        System.out.println("The max value is : " + findMaxInArrayUsingStreams(number));
        long endTime2 = System.currentTimeMillis();
        System.out.println("The total time  taken is : " + (endTime2 - startTime2) + MS);
        System.out.println("Array without streams");
        long startTime3 = System.currentTimeMillis();
        System.out.println("The max value in array is: " + findMaxInArray(number));
        long endTime3 = System.currentTimeMillis();
        System.out.println("The total time taken is : " + (endTime3 - startTime3) + MS);

        long startTime4 = System.currentTimeMillis();
        System.out.println("New array with even numbers: " + Arrays.toString(createArrayWithEvenNumbers(number)));
        long endTime4 = System.currentTimeMillis();
        System.out.println("time taken to run this methods : " + (endTime4 - startTime4) + MS);

        long startTime5 = System.currentTimeMillis();
        System.out.println("New Array with odd numbers: " + Arrays.toString(createArrayWithOddNumbers(number)));
        long endTime5 = System.currentTimeMillis();
        System.out.println("time taken to run this method : " + (endTime5 - startTime5) + MS);

        long startTime6 = System.currentTimeMillis();
        System.out.println("The number of time is : " + countOccurrencesInArrayUsingStreams(number, 12));
        long endTime6 = System.currentTimeMillis();
        System.out.println("The total time is  first : " + (endTime6 - startTime6) + MS);

    }

    /**
     * Checks if the given value is present in an array.
     *
     * @param array the given array
     * @param value the value to search
     * @return true if the value is present, false otherwise
     */
    public static boolean isValuePresentInArray(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the given element is present in an array using streams.
     *
     * @param array the given array
     * @param value the value to search
     * @return true if the value is present, false otherwise
     */
    public static boolean isValuePresentInArrayUsingStreams(int[] array, int value) {
        if (array == null) {
            return false;
        }
        return Arrays.stream(array).anyMatch(num -> num == value);
    }

    /**
     * Counts the number of times the element appears in an array.
     *
     * @param array the given array
     * @param value the element to count
     * @return the number of times the element appears in the array
     */
    public static int countOccurrencesInArray(int[] array, int value) {
        int count = 0;
        if (array == null) {
            return count;
        }
        for (int element : array) {
            if (element == value) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the number of times the element appears in an array using streams.
     *
     * @param array the given array
     * @param value the element to count
     * @return the number of times the element appears in the array
     */
    public static int countOccurrencesInArrayUsingStreams(int[] array, int value) {
        if (array == null) {
            return 0;
        }
        return (int) Arrays.stream(array).filter(num -> num == value).count();
    }

    /**
     * Finds the maximum element in an array.
     *
     * @param array the given array
     * @return the maximum element in the array
     */
    public static int findMaxInArray(int[] array) {
        if (array == null) {
            return 0;
        }
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    /**
     * Finds the maximum element in an array using streams.
     *
     * @param array the given array
     * @return the maximum element in the array
     */
    public static int findMaxInArrayUsingStreams(int[] array) {
        if (array == null) {
            return 0;
        }
        return Arrays.stream(array).max().orElse(0);
    }

    /**
     * Finds the minimum element in an array.
     *
     * @param array the given array
     * @return the minimum element in the array
     */
    public static int findMinInArray(int[] array) {
        if (array == null) {
            return 0;
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    /**
     * Creates a new array with even numbers from the given array.
     *
     * @param array the given array
     * @return a new array with even numbers
     */
    public static int[] createArrayWithEvenNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int count = (int) Arrays.stream(array).filter(num -> num % 2 == 0).count();
        int[] newArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }

    /**
     * Creates a new array with odd numbers from the given array.
     *
     * @param array the given array
     * @return a new array with odd numbers
     */
    public static int[] createArrayWithOddNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int count = (int) Arrays.stream(array).filter(num -> num % 2 != 0).count();
        int[] newArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
}

