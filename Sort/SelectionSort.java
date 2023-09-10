// In SelectionSort we select the smallest element from the unsorted part of the array and add it to the sorted part of the array.

// Time Complexity: O(n^2); 2 loops. Not so efficient with large datasets.

// Space Complexity: O(1); no extra space is used.

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted array
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


}
