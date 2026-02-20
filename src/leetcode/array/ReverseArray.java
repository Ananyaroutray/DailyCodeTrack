package leetcode.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}
