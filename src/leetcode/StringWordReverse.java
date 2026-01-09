package leetcode;

public class StringWordReverse {
    public static void main(String[] args) {
        String s = "ananya is a good girl";

//        String word ="";
//        String newStr = "";
//
//        for(int i=s.length()-1;i>=0; i--){
//            char c = s.charAt(i);
//            if(c!=' '){
//                word=c+word;
//            }else{
//                newStr=newStr+word+" ";
//                word="";
//            }
//        }
//        newStr+=word;
//        System.out.println(newStr);

        String[] newStr = s.split(" ");
        for(int i=newStr.length-1;i>=0; i--){
            System.out.print(newStr[i]+" ");
        }
    }
}
