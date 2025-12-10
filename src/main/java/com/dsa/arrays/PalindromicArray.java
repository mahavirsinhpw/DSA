package com.dsa.arrays;

// Time Complexity = O(n)
// space complexity = O(1)

public class PalindromicArray {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,6,4,2};
        int n = array.length;
        int flag = 0;

        for(int i=0; i<n/2; i++){
            if(array[i] != array[n-i-1]){
                flag=1;
                System.out.println("Not a Palindromic Array");
                break;
            }
        }

        if (flag == 0){
            System.out.println("Palindromic Array");
        }
    }
}

