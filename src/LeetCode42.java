public class LeetCode42 {
    public int trap(int[] height) {
        int p=0;
        int left=height[p];
        int ans=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>=left){
                for(int j=p+1;j<i;j++){
                    ans+=left-height[j];
                }
                p=i;
                left = height[p];
            }else if(i==height.length-1){
                int right=height[i];
                for (int j=i-1;j>p;j--){
                    if(height[j]>right){
                        right=height[j];
                    }else{
                        ans+=right-height[j];
                    }

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode42 test = new LeetCode42();
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.printf(Integer.toString(test.trap(nums)));
    }
}
