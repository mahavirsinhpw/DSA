package com.dsa.arrays;

import java.util.Arrays;
import java.util.List;

//Write a program to print the sum of all the elements present on even indices in the given array.
public class ArrayProblem1 {
    public static void main(String[] args) {
//        int arr[] = {3, 20, 4, 6, 9, 15, 4, 10, 20};
        // Example : 1
        int arr[] = {3,20,4,6,9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

        // Example : 2
        int arr2[] = {4,3,6,7,1};
        int sum2 = 0;
        for (int i =0; i< arr2.length; i++){
            if (i%2 == 0){
                sum2 = sum2+arr2[i];
            }
        }
        System.out.println(sum2);
    }
}
