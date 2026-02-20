package leetcode.array;

import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,5,6,1};
        int[] arr2 = {2,5,0,9,8,1,1};

        HashSet<Integer> commonElement = elementFind(arr1,arr2);
        System.out.println(commonElement);
    }

    public static HashSet<Integer> elementFind(int[] arr1, int[] arr2){

        HashSet<Integer> set1 = new HashSet<>();
        for(int num: arr1){
            set1.add(num);
        }
        HashSet<Integer> interSection = new HashSet<>();
        for(int num: arr2){
            if(set1.contains(num)){
                interSection.add(num);
            }
        }
        return interSection;
    }
}
