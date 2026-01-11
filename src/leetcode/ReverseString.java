package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("ariz"));

    }

    String reverse(String s){
        char[] arr = s.toCharArray();
        int left =0;
        int right=arr.length-1;

        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
