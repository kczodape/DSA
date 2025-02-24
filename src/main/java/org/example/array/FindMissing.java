package org.example.array;

public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        int n = arr.length+1;

        int totalSum = n*(n+1)/2;
        int calculatedSum = 0;

        for (int i = 0; i < arr.length; i++) {
            calculatedSum = arr[i] + calculatedSum;
        }

        int missingNum = totalSum-calculatedSum;
        System.out.println(missingNum);
    }
}

class FindNumber{

}
