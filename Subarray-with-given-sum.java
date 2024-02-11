class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
ArrayList<Integer> result = new ArrayList<>();
 int sum=0,j=0;
 for(int i=0;i<n;i++){
     sum+=arr[i];
     while(sum>s&&j<i){
         sum-=arr[j];
         j++;
     }
     if(sum==s){
         result.add(j+1);
         result.add(i+1);
         return result;
     }
 }
 result.add(-1);
 return result;
    }
}
