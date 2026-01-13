package com.dsa.arrays;
// Given an array. Find the Highest peak element in the array. A peak element is an element that is greater than
//its just left and just right neighbor.
public class ArrayProblem5 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,5};

        int highestPeak = Integer.MIN_VALUE;
        Boolean found = false;

        for (int i =1; i< arr.length-1; i++){

            if (arr[i]> arr[i-1] && arr[i]>arr[i+1]){
//                for (int j =0; j<arr.length; j++){
//                    if (arr[j]>highestPeak){
//                        highestPeak = arr[j];
//                    }
//                }
                highestPeak = Math.max(highestPeak, arr[i]);
                found = true;
            }
        }

        if (found){
            System.out.println("peak "+highestPeak);
        }else {
            System.out.println("no peak element found ");
        }
    }
}
