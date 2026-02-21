package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonElementWithDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,3,4,1};
        int[] arr2 = {1,4,3,1,1};

        List<Integer> res = interSection(arr1,arr2);
        System.out.println(res);

    }

    public static List<Integer> interSection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr1){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> common = new ArrayList<>();

        for(int num:arr2){
            if(map.containsKey(num) && map.get(num) > 0){
                common.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        return common;
    }
}
