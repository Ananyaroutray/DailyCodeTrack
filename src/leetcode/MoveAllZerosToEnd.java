package leetcode;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,4,6,0,2,0,6,8,0};
        System.out.println(Arrays.toString(moveZero(arr)));
    }

    public static int[] moveZero(int[] arr){
        int first = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]!=0){
                arr[first] = arr[i];
                first++;
            }
        }

        while(first<arr.length){
            arr[first]=0;
            first++;
        }

        return arr;
    }
}
