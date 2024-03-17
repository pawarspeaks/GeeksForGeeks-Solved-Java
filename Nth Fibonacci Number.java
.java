
//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
      int sum[]=new int[n];
        sum[0]=1;
        sum[1]=1;
        for(int i=2;i<n;i++){
            sum[i]=(sum[i-1]+sum[i-2])%1000000007;
        }
        return sum[n-1];
        
    }
}