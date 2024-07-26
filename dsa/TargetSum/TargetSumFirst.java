package dsa.TargetSum;

import java.util.Scanner;

public class TargetSumFirst {
    public static void main(String[] args) {
      int[] arr = ArrayUtility.inputArray();
      int target_sum  =  7;
      int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if((arr[i]+arr[j]) == target_sum){
                    count++;
                }
            }

        }
        System.out.println("pairs in this array whose sum is "+target_sum+" are: "+ count);

    }
}
