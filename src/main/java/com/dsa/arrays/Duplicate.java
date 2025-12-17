package com.dsa.arrays;

// Time Complexity : O(n^2)
// Space Complexity : O(1)

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 9, 10};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is : " + arr[i]);
                }
            }
        }
    }
}
