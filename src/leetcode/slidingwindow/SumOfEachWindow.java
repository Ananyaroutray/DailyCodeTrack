package leetcode.slidingwindow;

public class SumOfEachWindow {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,1,4};
        int k =2;
        int windowSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                System.out.print(windowSum + " ");
                windowSum -= arr[i - (k - 1)];
            }
        }

    }
}
