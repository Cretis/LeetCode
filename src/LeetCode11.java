public class LeetCode11 {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int ans=0;
        while(left<right){
            if(height[left]<height[right]){
                ans = Math.max(ans,height[left]*(right-left));
                left++;
            }else{
                ans = Math.max(ans,height[right]*(right-left));
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode11 test = new LeetCode11();
        int[] nums = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.printf(Integer.toString(test.maxArea(nums)));
    }
}
