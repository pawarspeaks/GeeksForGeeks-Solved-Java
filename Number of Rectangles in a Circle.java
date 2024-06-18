// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        // code here
         int res = 0;
        for(int i=1; i<=2*r; i++){
            for(int j = 1; j<=2*r; j++){
                if(i*i + j*j <= 4*r*r){
                    res++;
                }
            }
        }
        return res;
    }
};
