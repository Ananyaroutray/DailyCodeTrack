package leetcode;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MOKM";
        System.out.println(palindromeStr(s));
    }
    public static Boolean palindromeStr(String s){
        s.toLowerCase();
        char[] arr = s.toCharArray();

        int first =0;
        int last = arr.length-1;

        while(first<last){
            if(arr[first]!=arr[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
