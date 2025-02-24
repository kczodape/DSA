package org.example.array;

import java.util.ArrayList;

public class SecondSmallAndLarg {
    public static void main(String[] args) {
        int[] arr ={8, 4, 5, 0, 8, 0, 7, 0, 4, 5, 0, 7, 2, 3, 0, -1, -44};
        ArrayList<Integer> arrayList = secondSmallAndLargeElement(arr);
        for (int num : arrayList){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Second Largest Element: "+ arrayList.get(1));
        System.out.print("Second Smallest Element: "+arrayList.get(arrayList.size()-2));
    }
    static ArrayList secondSmallAndLargeElement(int arr[]){
        int n = arr.length;
        int temp;
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i]< arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int j;
            for ( j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    break;
                }
            }
            if (i == j) {
                tempArr.add(arr[i]);
            }
        }
        return tempArr;
    }
}
