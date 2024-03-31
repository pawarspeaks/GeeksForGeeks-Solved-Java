class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
     long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            if(i<2)
            {
                a[i]=1;
            }
            else
            {
                a[i]=a[i-1]+a[i-2];
            }
        }
        return a;
    }
}
