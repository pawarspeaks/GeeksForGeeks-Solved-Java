class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
    HashSet<Node> sp = new HashSet<>();
       
       Node ptr = head;
       Node prev = null ;
       while( ptr != null ){
           if(sp.contains(ptr)){
            prev.next = null;
            break;
               
           }else{
               sp.add(ptr);
           }
           
           prev = ptr;
           ptr = ptr.next;
       }
       
       
       
       
    }
}
