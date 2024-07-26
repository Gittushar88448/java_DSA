package dsa.TargetSum;

public class TargetSumSecondQuiz {
    public static int tripletTargetSum(int[] arr, int target){
        int count = 0;
        for (int i =  0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i]+ arr[j]+ arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int target = 12;
        int result = tripletTargetSum(arr, target);
        System.out.println("Triplet pair of sum 12 is : " + result);
    }
}
