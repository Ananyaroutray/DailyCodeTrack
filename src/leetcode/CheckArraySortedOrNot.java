package leetcode;

import java.util.Arrays;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,14,8,9,34,65};
        System.out.println(method(arr));
    }

    public static boolean method(int[] arr){
        int first = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[first]>arr[i]){
                return false;
            }
            first++;
        }
        return true;
    }
}
