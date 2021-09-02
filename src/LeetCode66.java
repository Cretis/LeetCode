import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        if(digits[0]==0){
            digits=new int[digits.length+1];
            digits[0]=1;
        }
        return digits;
    }

    public static void main(String[] args) {
        LeetCode66 test = new LeetCode66();
        int[] nums = {1,2,3};
        System.out.printf(Arrays.toString(test.plusOne(nums)));
    }
}
