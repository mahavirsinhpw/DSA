package com.dsa.arrays.twoDArray;

import java.util.Scanner;

public class PrefixSumOptimised {

    // Time Complexity = O(1)
    // Space Complexity = O(1)
    public static int findSumOfRegion(int arr[][], int r1, int c1, int r2, int c2){
        int totalSum, upSum, leftSum, repeatedRegionSum, result = 0;

        totalSum = arr[r2][c2];
        upSum = arr[r1-1][c2];
        leftSum = arr[r2][c1-1];
        repeatedRegionSum = arr[r1-1][c1-1];
        result = totalSum - upSum - leftSum + repeatedRegionSum;

        return result;
    }

    // Time Complexity = O(m *n)
    // Space Complexity = O(1)
    public static void findPrefixSumMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        // row wise prefix sum
        for (int i =0; i<m; i++){
            for (int j =1; j<n; j++){
                arr[i][j] = arr[i][j]+arr[i][j-1];
            }
        }

        // column wise prefix sum
        // final 2D Array Matrix
        for (int j =0; j<n; j++){
            for (int i =1; i<m; i++){
                arr[i][j] = arr[i][j] + arr[i-1][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows : ");
        int m = sc.nextInt();

        System.out.println("enter the number of columns : ");
        int n = sc.nextInt();

        int[][] arr  =  new int[m][n];
        System.out.println("enter the Array elements ");
        for (int i =0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int r1, r2, c1, c2;
        System.out.println("enter the value of coordinate r1 : ");
        r1 = sc.nextInt();

        System.out.println("enter the value of coordinate c1 : ");
        c1 = sc.nextInt();

        System.out.println("enter the value of coordinate r2 : ");
        r2 = sc.nextInt();

        System.out.println("enter the value of coordinate c2 : ");
        c2 = sc.nextInt();

        findPrefixSumMatrix(arr);
        int result = findSumOfRegion(arr,r1,c1,r2,c2);
        System.out.println("sum of given region is : "+result);
    }
}
