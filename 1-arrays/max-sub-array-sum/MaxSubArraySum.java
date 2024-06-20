/*
 Find the largest sum contiguous subarray.
 Problem: Given an Array of positive and negative integers, find a
 contiguous subarray whose sum (sum of elements) is maximum. 
 */

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,-4,6,-4,3,2};
        System.out.println("Max sub array sum :" + maxSubArraySum(arr, arr.length));
    }


    public static int maxSubArraySum(int[] arr, int size) {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            System.out.println("MaxSoFar: " + maxEndingHere);
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            // System.out.println("MaxSoFar: " + maxSoFar);
        }
        return maxSoFar;
    }
}
