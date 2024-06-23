import java.util.Arrays;

/*
Problem: Consider sorting n numbers stored in array A by first finding the smallest element of A and putting it in first entry of another arra B.
Then find second smallest element of A and put in the second entry of B. Continue the process for the remaining elements of A.
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 9, 7, 8, 3, 2, 1, 5, 4, 6 };
        int[] b = selectionSort(a);
        System.out.println("Result selection sort:"+Arrays.toString(b));
    }

    public static int[] selectionSort(int[] arr) {
        int size = arr.length;
        int[] resultArray = new int[size];
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;

            for (int j = 0; j < size; j++) {
                if (!visited[j] && arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            resultArray[i] = minValue;
            visited[minIndex] = true;
        }

        return resultArray;
    }

}
