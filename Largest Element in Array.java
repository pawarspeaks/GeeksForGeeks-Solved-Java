class Compute {
    
    public int largest(int arr[], int n)
    {
     n =arr.length;
        Arrays.sort(arr);//arrange the array in ascending order 
        return (arr[n-1]);
    }
}
