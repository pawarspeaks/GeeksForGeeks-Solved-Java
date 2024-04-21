
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
    for(int i = 0; i < S.length() ; i++){
            char ch = S.charAt(i);
            String s = S.substring(0,i)+S.substring(i+1);
            if(!s.contains(ch+""))return ch;
        }
        return '$';
        
    }
}

