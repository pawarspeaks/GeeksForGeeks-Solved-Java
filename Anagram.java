class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
       char ch1[] = a.toCharArray();
        Arrays.sort(ch1);
        
        char ch2[] = b.toCharArray();
        Arrays.sort(ch2);
        
        int n1 = ch1.length;
        int n2 = ch2.length;
        
        if(n1!=n2) return false;
        
        for(int i=0;i<n1;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;   
    }
}
