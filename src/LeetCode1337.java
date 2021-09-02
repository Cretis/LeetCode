import java.util.*;

public class LeetCode1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int m = mat.length, n =mat[0].length;
        for(int i=0;i<m;i++){
            int soldierNum=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    soldierNum++;
                }else{
                    break;
                }
            }
            hashmap.put(i,soldierNum);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hashmap.entrySet());
        list.sort((Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)->{
            if(o1.getValue()==o2.getValue()){
                return o1.getKey()-o2.getKey();
            }else{
                return o1.getValue()-o2.getValue();
            }
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode1337 test = new LeetCode1337();
        int[][] nums = {{1,1,0,0,0},{1, 1, 1, 1, 0},{1, 0, 0, 0, 0},{1, 1, 0, 0, 0},{1, 1, 1, 1, 1}};
        System.out.printf(Arrays.toString(test.kWeakestRows(nums,3)));
}
}
