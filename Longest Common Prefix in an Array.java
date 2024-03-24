class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
       String dummy= arr[0];
        for(int i=0;i<n;i++)
        {
            while(arr[i].indexOf(dummy)!=0)
            {
                dummy=dummy.substring(0,dummy.length()-1);
            }
            if(dummy.isEmpty())
            {
                return "-1";
            }
        }
        return dummy;
    }
}
