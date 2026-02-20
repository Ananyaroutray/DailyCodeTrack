package leetcode.array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,7,8,2,9,5,9};
        System.out.println(maxElement(arr));
    }
    public static int maxElement(int[] arr){
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
