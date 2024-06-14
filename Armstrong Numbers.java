// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int ans=0;
        int i, realN=n;
        while(n!=0)
        {
            i=n%10;
            ans+=i*i*i;
            n=n/10;
        }
        if(ans==realN)
        {
            return "true";
        }
        else
        {
            return "false";
        }    
    }
}
