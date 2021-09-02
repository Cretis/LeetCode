import java.util.Arrays;

public class LeetCode31 {
    public int[] nextPermutation(int[] nums) {
        int p = nums.length-1,n=nums.length-1;
        int first = -1;
        while(p>0){
            if(nums[p-1]<nums[p]){
                first=p-1;
                p=n;
                break;
            }
            p--;
        }
        while(p>0){
            if(nums[p]>nums[first]){
                exchange(nums,p,first);
                break;
            }
            p--;
        }
        first++;
        while(first<n){
            exchange(nums,first,n);
            first++;
            n--;
        }

        return nums;
    }
    public void exchange(int[]nums,int p, int q){
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }

    public static void main(String[] args) {
        LeetCode31 test = new LeetCode31();
        int[] nums = new int[] {1,3,2};
        System.out.printf(Arrays.toString(test.nextPermutation(nums)));
    }
}
