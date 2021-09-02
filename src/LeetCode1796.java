import java.util.*;

public class LeetCode1796 {
    public int secondHighest(String s) {
        int first = -1,second=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num=s.charAt(i)-'0';
                if(first==-1){
                    first=num;
                }else if(num>first){
                    second=first;
                    first=num;
                }else if(num<first&&num>second){
                    second=num;
                }

            }
        }
        return second;

    }

    public static void main(String[] args) {
        LeetCode1796 test =new LeetCode1796();
        String s1 = "dfa12321afd";
        String s2 = "abc1111";
        System.out.printf(Integer.toString(test.secondHighest(s1))+"\n");
        System.out.printf(Integer.toString(test.secondHighest(s2)));
    }
}
