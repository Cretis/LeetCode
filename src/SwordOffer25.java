public class SwordOffer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2;
        ListNode ans = new ListNode(0);
        ListNode p3=ans;
        while(p1.next!=null||p2.next!=null){
            if(p1.next!=null&&p2.next!=null){
                if(p1.val<p2.val){
                    ans.next=p1;
                    p1=p1.next;
                    ans = ans.next;
                }else{
                    ans.next=p2;
                    p2=p2.next;
                    ans=ans.next;
                }
            }else if(p1.next!=null){
                ans.next=p1;
                p1=p1.next;
                ans=ans.next;
            }else{
                ans.next=p2;
                p2=p2.next;
                ans=ans.next;
            }
        }
        return p3.next;
    }
}
