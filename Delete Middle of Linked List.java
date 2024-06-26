class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
     if(head == null || head.next == null)
            return null;
        
        Node slow = head;
        Node fast = head;
        Node preMid = null;
        
        while(fast != null && fast.next != null){
            preMid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Adjust pointers to skip the middle node
        preMid.next = slow.next;
        
        return head;
    }
}
