package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

import java.util.Scanner;

public class RotateKthTimes {

    public static int[] rotate( int[] arr , int k){
        int n = arr.length;
        k = k % n;
        int j = 0;
        int[] arr1 = new int[n];

        // this is for last to first rotation
        for (int i = n - k; i < n; i++) {
            arr1[j++] = arr[i];
        }
        // Now this is used to push last element in the new array

        for (int i = 0; i < n - k; i++) {
            arr1[j++] = arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rotations you want: ");
        int k = input.nextInt();

        int[] result = rotate(arr , k);
        ArrayUtility.printArray(result);
    }
 }
