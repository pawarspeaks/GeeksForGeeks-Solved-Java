class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap <Integer,Integer> hs = new HashMap<>();
        int res =0,pre_sum =0;
        
        for(int i : arr)
        {
            pre_sum = k - i;
            if(hs.containsKey(pre_sum)) res+= hs.get(pre_sum);
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        return res;
    }
}


