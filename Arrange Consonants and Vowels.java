
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
           HashSet<Character> vowelSet = new HashSet<>();
        
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        
        Node newHead = head;
        Node consHead = new Node(' '); // Dummy node for consonants
        Node vowelHead = new Node(' '); // Dummy node for vowels
        Node cons = consHead;
        Node vowel = vowelHead;
        
        while (newHead != null) {
            if (vowelSet.contains(newHead.data)) {
                vowel.next = newHead;
                vowel = vowel.next;
            } else {
                cons.next = newHead;
                cons = cons.next;
            }
            newHead = newHead.next;
        }
        
        // Connect the vowel list to the consonant list
        vowel.next = consHead.next;
        // Ensure the end of the list
        cons.next = null;
        
        // Return the head of the combined list
        return vowelHead.next;
    }
}
