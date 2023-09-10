// In InsertionSort we iterate over the array and take the current element where we on as a key, the key element is compared with all the previous elements, if the key element is smaller than the previous element, it is inserted at the previous position.

// Time Complexity: O(n^2); uses to loops; not very efficient.

// Space Complexity: O(1);

public class InsertionSort{

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            // Move elements that are greater than key, to one position ahead of their current position.
            while (j>=0 && arr[j]>=key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

}
