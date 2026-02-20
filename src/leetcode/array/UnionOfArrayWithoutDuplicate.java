package leetcode.array;

import java.util.HashSet;

public class UnionOfArrayWithoutDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,2,3};
        int[] arr2 = {2,7,8,7,5};
        HashSet<Integer> union = unionOfArray(arr1,arr2);
        System.out.println(union);
    }
    public static HashSet<Integer> unionOfArray(int[] arr1, int[] arr2){
        HashSet<Integer> union = new HashSet<>();

        for(int num : arr1){
            union.add(num);
        }

        for(int num : arr2){
            union.add(num);
        }

        return union;
    }
}
