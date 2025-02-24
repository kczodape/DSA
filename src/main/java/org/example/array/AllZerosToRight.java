package org.example.array;

import java.util.Scanner;

public class AllZerosToRight {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 4, 5, 0, 8, 0, 7, 0, 4, 5, 0, 7, 2, 3, 0, -1, -44};
        moveZerosToEnd(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }

    static void moveZerosToEnd(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                temp[j++] = arr[i];
            }
        }

        while (j < n){
            temp[j++] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

}
