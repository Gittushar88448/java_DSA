package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

public class ReverseArrayInPlace {

    public static void swapValues(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            swapValues(arr , i , j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        reverse(arr);
        ArrayUtility.printArray(arr);
    }
}
