class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
          if(n==0){
            return 1;
        }
        if(n==1) return x;
        
        long ans=PowMod(x,n/2,m);
         ans=(ans%m)*(ans%m);
         ans=ans%m;
        if(n %2 ==1)
        {
            ans= (ans*x)%m;
        }
        return ans;
        
    }
}
