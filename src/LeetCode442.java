import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int x:nums){
            int index = Math.abs(x)-1;
            if(nums[index]<0){
                ans.add(index+1);
            }else{
                nums[index]=-nums[index];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode442 test = new LeetCode442();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.printf(test.findDuplicates(nums).toString());
    }
}
