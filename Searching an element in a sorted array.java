class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
          int h=Arrays.binarySearch(arr,K);
        if(h>=0)return 1;
        return -1;
    }
}
