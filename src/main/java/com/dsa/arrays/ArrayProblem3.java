package com.dsa.arrays;

// Q3 : Write a program to calculate the maximum element in the array.
public class ArrayProblem3 {
    public static void main(String[] args) {

        // Example : 1
        int arr[] = {34, 21, 54, 65, 43};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println();

        // Example : 2
        int arr2[] = {4, 3, 6, 7, 1};

        int max2 = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }
        System.out.println(max2);
    }
}
