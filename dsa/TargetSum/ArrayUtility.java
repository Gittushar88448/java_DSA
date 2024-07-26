package dsa.TargetSum;

import java.util.Scanner;

public class ArrayUtility {
    public static void printArray(int[] arr){
        System.out.println("Printing Array :  ");
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+ " elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
