class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
           for(int i=0;i<n-1;i+=2){
        int temp=0;
        if(a[i]<=a[i+1]){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    }
}
        
