package com.dsa.arrays;

// Given an array. Find the FIRST peak element in the array. A peak element is an element that is greater than
//its just left and just right neighbor.
public class ArrayProblem6 {
    public static void main(String[] args) {
        // Example : 1
        int arr[] = {1, 3, 2, 6, 5};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.println();
        // Example : 2
        int arr2[] = {1, 4, 7, 3, 2, 6, 5};
        for (int i = 1; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i - 1] && arr2[i] > arr2[i + 1]) {
                System.out.println(arr2[i]);
                break;
            }
        }
    }
}
