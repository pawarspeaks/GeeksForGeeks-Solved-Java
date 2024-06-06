class Solution {
    public List<String> find_permutation(String S) {
        // Code here
            Set<String> temp=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();
        permutation("",S,temp);
        ans.addAll(temp);
        Collections.sort(ans);
        return ans;
    }
    public static void permutation(String p,String up,Set<String> temp)
    {
        if(up.isEmpty())
        {
            temp.add(p);
            return;
        }
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+c+s,up.substring(1),temp);
        }
        
    }
}
