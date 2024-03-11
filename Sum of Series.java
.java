class Solution {
    public static long seriesSum(int n) {
        // code here
     int i=1;
        long sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
        
    }
}
        
