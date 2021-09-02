import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode448 test = new LeetCode448();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.printf(test.findDisappearedNumbers(nums).toString());
    }
}
