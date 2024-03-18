class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
       String[] arr= S.split("\\.");
        String dummy="";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i>0)
            {
            dummy=dummy+arr[i]+".";
            }
            else
            dummy=dummy+arr[i];
            
        }
        return dummy;
    }
}
