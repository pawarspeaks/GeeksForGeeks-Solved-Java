class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
      HashMap<Integer,Integer>map = new HashMap<>();
        int index = 0;
        int res = Integer.MAX_VALUE;
        int i = 0;
        while(i<n)
        {
            if(!map.containsKey(arr[i]))
            map.put(arr[i],i);
            else
            {
                index = map.get(arr[i]);
                res = Math.min(index,res);
            }
            i++;
        }
        if(res == Integer.MAX_VALUE)
        return -1;
        
        return res+1;
    }
}
