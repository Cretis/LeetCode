public class LeetCode5 {
    public String longestPalindrome(String s){
        int start=0,end=0;
        int n=s.length();
        if(n<2){
            return s;
        }
        if(n==2){
            if(s.charAt(0)==s.charAt(1)){
                return s;
            }else{
                return s.substring(1);
            }
        }
        for(int i=0;i<n;i++){
            int len1=palindrome(s,i,i);
            int len2=palindrome(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if (maxLen>end-start){
                start=i-(maxLen-1)/2;
                end=i+maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }

    public int palindrome(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        LeetCode5 test = new LeetCode5();
        String s="babad";
        System.out.printf(test.longestPalindrome(s));
    }
}
