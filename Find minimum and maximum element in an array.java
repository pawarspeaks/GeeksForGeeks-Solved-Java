
/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
   long x = Long.MAX_VALUE;
        long y = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            x = Math.min(a[i],x);
            y = Math.max(a[i],y);
        }
        return new Pair(x,y);
    }
}
