class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
          long maxSum=arr[0];
          long crrSum=arr[0];
        // Your code here
        for(int i =1;i<arr.length;i++){
           //ignore negative add only +ve number
            if(crrSum>=0){
                crrSum+=arr[i];
            }else{
                crrSum=arr[i];
            }

//check for maximum sum 
            if(maxSum<crrSum){
                maxSum=crrSum;
            }
        }
             return maxSum;
    }
    
}

