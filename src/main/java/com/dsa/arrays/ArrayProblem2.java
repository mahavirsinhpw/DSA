package com.dsa.arrays;
// Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.
public class ArrayProblem2 {
    public static void main(String[] args) {

        // Example : 1
        int arr[] = {34,21,54,65,43};
        for (int i =0; i< arr.length; i++){
            if (arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        // Example : 2
        int arr2[] = {4,3,6,7,1};
        for (int i =0; i< arr2.length; i++){
            if (arr2[i]%2 == 0){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
