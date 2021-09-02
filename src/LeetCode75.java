import java.util.Arrays;

public class LeetCode75 {
    public int[] sortColors(int[] nums) {
        int zero =0,two=nums.length-1;
        for(int i=0;i<=two;i++){
            while(i<=two &&nums[i]==2){
                swap(nums,i,two);
                two--;
            }
            if(nums[i]==0){
                swap(nums,zero,i);
                zero++;
            }
            }
        return nums;
    }

    public void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    public static void main(String[] args) {
        LeetCode75 test = new LeetCode75();
//        int[] nums = {1,2};
//        System.out.printf(Arrays.toString(test.sortColors(nums)));
//        int[] nums2 = {2,0,2,1,1,0};
//        System.out.printf(Arrays.toString(test.sortColors(nums2)));
        int[] nums3 = {1,2,0};
        System.out.printf(Arrays.toString(test.sortColors(nums3)));
    }
}
