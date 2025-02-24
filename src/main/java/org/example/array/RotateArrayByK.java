package org.example.array;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int leftRotate = 1;
        int rightRotate = 2;
        int[] rotatedLeft = rotateLeft(arr, leftRotate);
        for (int num: rotatedLeft){
            System.out.print(num+" ");
        }
    }

    static int[] rotateLeft(int[] arr, int leftRotate){
        int n = arr.length;
        int[] temp = new int[n];
        int brkpoint = 0;
        for (int i = 0; i < n; i++) {
            if (i == n-leftRotate) {
                brkpoint = i;
                break;
            }else {
                temp[i] = arr[i + leftRotate];
            }
        }
        System.out.println("Breakpoint variable "+brkpoint);

        for (int i = brkpoint; i < n; i++) {
            temp[i] = arr[i-brkpoint];
        }
        return temp;
    }
}
