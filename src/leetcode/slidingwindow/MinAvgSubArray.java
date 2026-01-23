package leetcode.slidingwindow;

public class MinAvgSubArray {
    public static void main(String[] args) {

        int[] arr = {1,4,3,5,2,7,9};
        int k =3;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)];
            }
        }

        double maxAvg = (double) maxSum / k;
        System.out.println(maxAvg);
    }
}
