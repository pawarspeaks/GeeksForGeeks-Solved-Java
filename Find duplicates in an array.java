class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> dups = new ArrayList<>();
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int x: arr) {
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> ent : mp.entrySet()) {
            if(ent.getValue() > 1)
                dups.add(ent.getKey());
        }
        if(dups.isEmpty())
            dups.add(-1);
        
        return dups;
    }
}
