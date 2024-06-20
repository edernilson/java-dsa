/*
 Problem: Given an Array, you need to rotate its elements K number of
 times. For example, an Array [10,20,30,40,50,60] rotate by 2 positions to
 [30,40,50,60,10,20]. The solution should have a linear time complexity.
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int k = 2;
        int size = arr.length;
        rotateArray(arr, size, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int n, int k) {
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
