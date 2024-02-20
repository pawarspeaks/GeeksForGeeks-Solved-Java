class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
          int ans = -1;
        Arrays.sort(a);
        int k = size/2;
        int n= size;
        for(int i=0;i<n-k;i++){
            if(a[i]==a[i+k]){
                ans=a[i];
                break;
            }
        }
        return ans;
    }
}
