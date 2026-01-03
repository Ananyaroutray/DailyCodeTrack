package leetcode;

import java.util.Arrays;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,3,8,9};
        int[] arr2 = {2,4,1,7,5};

        int[] res = new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(merge(arr1,arr2,res)));

    }

    public static int[] merge(int[] arr1, int[] arr2, int[] res){
        int k =0;

        for(int i=0;i<arr1.length;i++){
            res[k++] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            res[k++]=arr2[i];
        }
        Arrays.sort(res);
        return res;
    }

}
