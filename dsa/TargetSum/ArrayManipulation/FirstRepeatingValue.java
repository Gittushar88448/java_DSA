package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

public class FirstRepeatingValue {

    public static int firstRepeatingValue(int[] arr){
        int val = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    val =  arr[i];
                    return val;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int result  = firstRepeatingValue(arr);
        System.out.println("first repetative value is "+result);
    }
}
