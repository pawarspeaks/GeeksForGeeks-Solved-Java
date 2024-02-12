// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
          int sum=0;
        int arraysum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        
        for(int j=0;j<=array.length-1;j++){
            arraysum+=array[j];
        }
        return sum-arraysum;
    }
}
