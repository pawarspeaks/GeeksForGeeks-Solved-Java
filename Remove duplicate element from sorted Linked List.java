class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
    Node j=head;
        Node i=head.next;
        
        while(i!=null){
            if(i.data==j.data){
                j.next=null;
                i=i.next;
            }
            else{
                j.next=i;
                j=i;
                i=i.next;
            }
        }
        
        return head;
    }
}
