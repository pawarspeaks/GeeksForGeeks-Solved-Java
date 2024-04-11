class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
      int left = -1,right = -1,ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                left=i;
            }
            if(a[i]==y){
                right=i;
            }
            if(left!= -1 && right!= -1){
                ans = Math.min(ans,Math.abs(left - right));
            }
        }
        return ans ==Integer.MAX_VALUE? -1 : ans;
    }
}
