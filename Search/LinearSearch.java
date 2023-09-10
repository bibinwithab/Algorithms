// The LinearSearch also called Sequential Search is one of the brute force methods to find an element in an array.

// Time Complexity: O(n); Where n is the size off the array. So, It is not very efficient fot large arrays

// Space Complexity: O(1); Space allocation does not depend on the size of the array. It is always constant.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element is not found");
        }else {
            System.out.println("Key element is found at index: "+index);
        }
    }

    // The given is checked through-out the array and the index is returned if found.

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}
