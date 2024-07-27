package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

import java.util.Scanner;

public class RotateInPlace {

    public static void rotateInPlace(int[] arr , int k ){
        int n = arr.length;
        k = k % n;
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-k-1);
        reverse(arr , 0 , n-1);

    }
    public static void swapValues(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i , int j){

        while (i < j){
            swapValues(arr , i , j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int n = arr.length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rotations you want: ");
        int k = input.nextInt();

        rotateInPlace(arr , k);
        ArrayUtility.printArray(arr);
    }
}
