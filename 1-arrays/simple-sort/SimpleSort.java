import java.util.Arrays;

public class SimpleSort {

    public static void main(String[] args) {
        int[] arr = { 9, 7, 8, 3, 2, 1, 5, 4, 6 };
        System.out.println("5 Founded in index:"+search(arr, 5));
        System.out.println("Before sorting:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting:"+Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse:"+Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int j = 1; j < size; j++) {
            int key = arr[j];
            int i = j-1;
            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i-1;
            }; 

            arr[i+1] = key;
        }
    }

    public static void reverse(int[] arr) {
        int size = arr.length;
        for (int j = 1; j < size; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    public static int search(int[] arr, int key) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
