package com.company.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,n;
        int arr[][]=new int[2][3];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j]=i*j;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
