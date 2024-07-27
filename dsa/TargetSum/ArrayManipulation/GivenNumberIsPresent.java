package dsa.TargetSum.ArrayManipulation;

import dsa.TargetSum.ArrayUtility;

import java.util.Scanner;

public class GivenNumberIsPresent {
    public static int[] repeatedVal(int[] arr){
        int[] newArr = new int[100003];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        int[] resultArr = repeatedVal(arr);
        System.out.println("Enter the number of queries to be searched");
        int q = input.nextInt();
        while(q > 0) {
            System.out.println("Enter the element to be searched");
            int x = input.nextInt();
            if(resultArr[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
           q--;
        }
    }
}
