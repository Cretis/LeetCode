import java.util.ArrayList;
import java.util.List;

public class LeetCode68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        int start=0,end=0;
        while(end<n){
            int width = 0;
            int actualWitdth=0;
            List<String> level = new ArrayList<>();
            while(end<n){
                if(width+words[end].length()<maxWidth){
                    level.add(words[end]);
                    width+=words[end].length()+1;
                    end++;
                }else{
                    break;
                }
            }
            if(end==n&&width<maxWidth){
                if(end!=start){
                    end--;
                }
            }else{
                width-=words[end-1].length()+1;
                if(end!=start){
                    end--;

                }
            }
            for(int i=start;i<end;i++){
                words[i]+=" ";
            }
            int p=start;
            while(width<maxWidth){
                if(end!=start){
                    p=(p-start)%(end-start)+start;
                }
                if(p!=end-1){
                    words[p]+=" ";
                }
                if(end!=start){
                    p++;
                }
                width++;
            }
            String res = "";
            if(start!=end){
                for(int i=start;i<end;i++){
                    res+=words[i];
                }
            }else{
                res+=words[start];
                end++;
            }

            ans.add(res);
            start=end;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode68 test = new LeetCode68();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> ans = test.fullJustify(words,16);
        for(String x:ans){
            System.out.printf(x+"\n");
        }
    }
}
