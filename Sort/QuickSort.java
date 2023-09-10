// In QuickSort we recursively breakdown the array into subarrays to sort them. 

// Time Complexity: O(nlogn) in average case and O(n^2) in worst case

// Space Complexity: O(logn) in average case and O(n) in worst case

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the two sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the first element as the pivot
        int pivot = arr[low];

        // Initialize the indices for the left and right pointers
        int left = low + 1;
        int right = high;

        while (true) {
            // Find an element greater than the pivot from the left
            while (left <= right && arr[left] <= pivot) {
                left++;
            }

            // Find an element less than the pivot from the right
            while (left <= right && arr[right] >= pivot) {
                right--;
            }

            // If left and right pointers cross, break the loop
            if (left > right) {
                break;
            }

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // Swap pivot (arr[low]) with arr[right]
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        // Return the index of the pivot element
        return right;
    }
    
}
