public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int benefit = 0;
        for(int x: prices){
            if(x<=min){
                min = x;
            }else {
                benefit = Math.max(benefit,x-min);
            }
        }
        return benefit;
    }
}
