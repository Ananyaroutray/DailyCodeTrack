package leetcode;

import java.util.Arrays;

public class TwoSum { //sorted
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.method(new int[] {1,4,6,8,9,11} , 14)));
    }

    int[] method(int[] arr, int target){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int sum = arr[first]+arr[last];
            if(sum==target){
                return new int[] {first,last};
            } else if (sum>target) {
                last--;
            }else {
                first++;
            }
        }
        return new int[]{};
    }

}
