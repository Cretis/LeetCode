
import java.util.*;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashmap = new HashMap<Integer, Integer>();
        for(int x:nums){
            hashmap.put(x,hashmap.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(hashmap.entrySet());
        list.sort((Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> {
            return o1.getValue() - o2.getValue();
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
