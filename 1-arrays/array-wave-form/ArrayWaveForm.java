/*
 Problem: Given an array, arrange its elements in wave form such that odd
 elements are lesser then its neighbouring even elements.
 First solution: Compare even index values with its neighbour odd index
 values and swap if odd index is not smaller than even index.
 */
import java.util.Arrays;

public class ArrayWaveForm {
    public static void main(String[] args) {
        int[] arr = {8,1,2,3,4,5,6,4,2};
        waveForm(arr);
        System.out.println("Wave form array: "+Arrays.toString(arr));
    }

    public static void waveForm(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i += 2) {
            if ((i-1) >= 0 && arr[i] > arr[i-1]) {
                swap(arr, i, i-1);
            }
            if ((i+1) < size && arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
