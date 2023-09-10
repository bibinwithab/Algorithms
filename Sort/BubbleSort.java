// In Bubble Sort, the array is traversed from left. Each element is compared with the adjacent element.Larger element is moved to the right.
// This way the largest element is pushed to the right.
// The same process is repeated for the remaining elements excluding the previous element that was push.

// Time complexity: O(n^2); Because of two loops. Very slow for arrays with large number of data.

// Space complexity: O(1); No additional memory is required.

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                // comparing the adjacent elements.
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    // Swapping the bigger number to the right.
    public static void swap(int[] arr, int i, int j){
        if(i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}