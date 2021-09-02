import java.util.Deque;
import java.util.LinkedList;

public class LeetCode346 {
    /** Initialize your data structure here. */
    Deque<Integer> queue = new LinkedList<>();
    int size =0;
    int windowCount=0;
    int count = 0;
    public LeetCode346(int size) {
        this.size=size;
    }

    public double next(int val) {
        if(count == size){
            windowCount-=queue.peek();
            queue.poll();
            windowCount+=val;
            queue.add(val);
        }else{
            queue.add(val);
            windowCount+=val;
            count++;
        }

        return (double)windowCount/count;
    }

    public static void main(String[] args) {
        LeetCode346 test = new LeetCode346(3);
        System.out.printf(Double.toString(test.next(1)));
        System.out.printf(Double.toString(test.next(10)));
        System.out.printf(Double.toString(test.next(3)));
        System.out.printf(Double.toString(test.next(5)));
    }
}
