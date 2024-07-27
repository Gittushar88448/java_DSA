package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

import java.util.Arrays;

public class ReverseArrayTakingDiffArray {

    public static int[] reverseTakingDiffArray(int[] arr){
        int[] arr1 = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0 ; i--){
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] res = reverseTakingDiffArray(arr);
        ArrayUtility.printArray(res);
    }
}
