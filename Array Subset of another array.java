class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> map = new HashMap<>();
        for(long num:a1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(long num:a2){
            if(!map.containsKey(num) || map.get(num)==0) return "No";
            else{
                map.put(num,map.get(num)-1);
            }
        }
        return "Yes"; 
    }
}
