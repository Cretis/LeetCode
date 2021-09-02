public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num = x;
        int num2 = 0;
        while(num!=0){
            int remainder = num%10;
            num2*=10;
            num2+= remainder;
            num=(num-remainder)/10;
        }
        return x==num2;
    }

    public static void main(String[] args) {
        LeetCode9 test = new LeetCode9();
        System.out.printf(Boolean.toString(test.isPalindrome(121)));
    }
}
