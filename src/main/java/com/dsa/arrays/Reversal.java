package com.dsa.arrays;

// Time Complexity = O(n)
// Space Complexity = O(1)

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
