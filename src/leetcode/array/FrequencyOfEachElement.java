package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,2,4,4,6,7,2,6};
        System.out.println(frequency(arr));
    }

    public static HashMap<Integer,Integer> frequency(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        return map;

    }
}
