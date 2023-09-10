// The BinarySearch uses the concept of 'divide and conquer' to kind if the key element is present in the given array or not.

// This algorithm can be implemented in 2 ways:
// 1. Iterative Method
// 2. Recursive Method

// Time Complexity: O(log n); It is efficient for large arrays

// Space Complexity: O(1); Binary Search Algorithm uses no extra space to search the element.

public class BinarySearch {
    public static void main(String[] args) {

        // The array MUST be sorted in order to this algorithm to work.
        int[] arr = { 1, 2, 3, 4 };
        int key = 3;
        
        // For Iterative method
        int index = binarySearch(arr, key);
        
        // For Recursive method, find the low, middle and high indices and pass them as arguments
        // int index = binarySearch(arr, key, low, high);
        
        if (index == -1) {
            System.out.println("Element is not found");
        }else {
            System.out.println("Key element is found at index: "+index);
        }
    }

    // 1. Iterative Method
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            // Returns Mid value 
            if (arr[mid] == key)
                return mid;
            // Ignores the right half, if the key is less than middle element
            else if (arr[mid] > key)
                high = mid - 1;
            // Ignores the left half
            else
                low = mid + 1;
        }
        return -1;
    }

    // 2. Recursive Method
    /*public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearch(arr, key, low, mid - 1);
        else
            return binarySearch(arr, key, mid + 1, high);
    }*/
}
