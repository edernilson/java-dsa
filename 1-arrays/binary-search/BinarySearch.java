/*
 * Binary search is a fast search algorithm with run-time complexity of O(log n). 
 * This search algorithm works on the principle of divide and conquer. 
 * For this algorithm to work properly, the data collection should be in the sorted form.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int index = binarySearch(arr, arr.length, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found");
        }
    }
    
    public static int binarySearch(int arr[], int size, int value) {
        int mid;
        int low = 0;
        int high = size -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            } else {
                if (arr[mid] < value) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
