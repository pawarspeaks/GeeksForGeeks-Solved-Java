class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
            Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
        return head;
    }
}
