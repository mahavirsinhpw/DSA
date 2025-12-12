package com.dsa.arrays;

// Time Complexity = O(n)
// Space Complexity = O(1)

public class Missing {
    public static void main(String[] args) {
        // Missing number ranges from 1 to n
        int[] array = {1, 4, 6, 8, 5, 7, 3};

        // Missing number ranges from 0 to n
//        int [] array = {3,0,1};

        int n = array.length;


        // sum of natural elements
        // if the number ranges from 1 to n then
        int sumOfNaturalElements = ((n + 1) * (n + 2)) / 2;

        // if the number ranges from 0 to n then
//        int sumOfNaturalElements = (n*(n+1))/2;

        int sum = 0;
        // sum of current elements
        for (int j : array) {
            sum += j;
        }
        int missingElement = sumOfNaturalElements - sum;
        System.out.println("Missing element is : " + missingElement);
    }
}
