class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Dummy = new ListNode(0);
        Dummy.next = head;
         // create pointer
        ListNode current = Dummy;
        while(current.next!=null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
            current = current.next;
            }
        }
        return Dummy.next;
    }
    
}