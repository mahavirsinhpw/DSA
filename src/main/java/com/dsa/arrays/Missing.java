package com.dsa.arrays;

// Time Complexity = O(n)
// Space Complexity = O(1)

public class Missing {
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 8, 5, 7, 3};
        int n = array.length;
        // sum of natural elements
        int sumOfNaturalElements = ((n + 1) * (n + 2)) / 2;
        int sum = 0;
        // sum of current elements
        for (int j : array) {
            sum += j;
        }
        int missingElement = sumOfNaturalElements - sum;
        System.out.println("Missing element is : " + missingElement);
    }
}
