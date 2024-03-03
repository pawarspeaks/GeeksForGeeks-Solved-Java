class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Long> map1= new HashMap<>();
        HashMap<Long,Long> map2 = new HashMap<>();
        
        for(int i = 0; i<N; i++){
            map1.put(A[i],map1.getOrDefault(A[i],0L)+1);
        }
        for(int j = 0; j<N; j++){
            map2.put(B[j],map2.getOrDefault(B[j],0L)+1);
        }
        return map1.equals(map2);
    }
}
