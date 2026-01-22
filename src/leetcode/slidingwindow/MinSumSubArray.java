package leetcode.slidingwindow;

public class MinSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6,0};
        System.out.println(minSum(arr,3));
    }

    public static int minSum(int[] arr, int k){

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            windowSum = windowSum + arr[i];

            if(i>= k-1){
                minSum = Math.min(minSum,windowSum);
                windowSum = windowSum - arr[i-(k-1)];
            }
        }
        return minSum;
    }
}
