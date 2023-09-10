

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int key = 3;
        int index = binarySearch(arr, key);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
