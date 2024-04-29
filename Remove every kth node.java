
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
    // Your code here
        Node curr = head;
        
        if(head == null) return null;
        
        if(k == 1) return null;
        
        while(curr != null) {
            
           for(int i=0;i<k-2;i++) {
               if(curr != null && curr.next != null) {
                   curr = curr.next;
               } 
           }
           
           if(curr == null || curr.next == null) {
               break;
           }
           
           curr.next = curr.next.next;
           curr = curr.next;
            
        }
        
        return head;
    }
}
