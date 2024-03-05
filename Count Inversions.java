class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
        //Function to count inversions in the array. 
        static long count=0;
    static long inversionCount(long arr[], long N)
    {
        
        count=0;
        // Your Code Here
        mergeSort(arr,0,(int)(N-1));
        return count;
    }
    
    public static long[] mergeSort(long []arr,int lo, int hi){
        //check if only one element is there
        if(lo==hi){
            long []ba=new long[1];
            ba[0]=arr[lo];
            return ba;
        }
        
        int mid=(lo+hi)/2;
        long []left=mergeSort(arr,lo,mid);
        long []right=mergeSort(arr,mid+1,hi);
      
        return merge2SortedArray(left,right);
    }
    
   public static long []merge2SortedArray(long []left,long []right){
       int i=0;
       int j=0;
       int k=0;
       
       long []merged=new long[left.length+right.length];
       
       while(i<left.length && j<right.length){
           if(left[i]<=right[j]){
               merged[k]=left[i];
               i++;
               k++;
           }else{
               count += (long)(left.length-i);
               merged[k]=right[j];
               k++;
               j++;
           }
       }
       while(i<left.length){
           merged[k]=left[i];
           k++;
           i++;
       }
       while(j<right.length){
           merged[k]=right[j];
           k++;
           j++;
       }
       return merged;    }
}
