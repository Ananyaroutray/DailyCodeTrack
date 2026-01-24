package leetcode.slidingwindow;

public class CountSubarrayswithSum {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,2,8};
        int target = 10;
        int k = 2;
        int count = 0;
        int windowSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                if (windowSum == target) {
                    count++;
                }
                windowSum -= arr[i - (k - 1)];
            }
        }

        System.out.println(count);

    }
}
