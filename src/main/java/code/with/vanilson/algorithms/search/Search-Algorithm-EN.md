**Linear Search Algorithm**

**Definition**: Linear search is a simple search algorithm used to find a specific element in a list.
It works by sequentially checking each element of the list until the desired element is found or the list ends.

**Characteristics**:

- **Unordered Elements**: It can be used on lists where elements are not sorted.
- **No Repetition**: It works on lists without repeated elements, but it can also handle lists with duplicates.

**Time Complexity**:

- **Worst Case**: \(O(N)\)—The algorithm may need to check every element in the list.
- **Best Case**: \(O(1)\) - The desired element is found at the first position.

**Steps**:

1. Start from the first element of the list.
2. Compare the current element with the target element.
3. If the current element matches the target, return its index.
4. If the current element does not match, move to the next element.
5. Repeat steps 2–4 until the element is found or the list ends.
6. If the element is not found, return -1.

**Example**:

```java
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
        if (number.length == 0) {
            return -1;
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
```

This code demonstrates a linear search in Java, where the `linearSearch` method iterates through the array to find the
target element.


**Binary Search Algorithm**

**Definition**: Binary search is an efficient search algorithm used to find a specific element in a sorted list. It works by repeatedly dividing the search interval in half.

**Characteristics**:
- **Ordered Elements**: It requires the list to be sorted.
- **Divide and Conquer**: It reduces the search space by half with each step.

**Time Complexity**:
- **Worst Case**: \(O(\log N)\) - The algorithm divides the search space in half each time.
- **Best Case**: \(O(1)\) - The desired element is found at the middle position.

**Steps**:
1. Start with the entire list.
2. Find the middle element of the list.
3. Compare the middle element with the target element.
4. If the middle element matches the target, return its index.
5. If the middle element is greater than the target, repeat the process on the left half of the list.
6. If the middle element is less than the target, repeat the process on the right half of the list.
7. Repeat steps 2–6 until the element is found or the search interval is empty.
8. If the element is not found, return -1.