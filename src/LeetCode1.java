import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                return new int[] {hashmap.get(nums[i]),i};
            }else{
                hashmap.put(target-nums[i],i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        LeetCode1 test = new LeetCode1();
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.printf(Arrays.toString(test.twoSum(nums,target)));
    }
}
