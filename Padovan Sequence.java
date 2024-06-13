
//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
    int nMinus3TH = 1, nMinus2TH = 1, nMinus1TH = 1;
        
        for(int i = 3; i <= n; i++) {
            int nTH = (nMinus3TH + nMinus2TH) % 1000000007;   // handling large values using mod 10e9 + 7
            nMinus3TH = nMinus2TH;       
            nMinus2TH = nMinus1TH;       // update values for consistent result
            nMinus1TH = nTH;
        }
        
        return nMinus1TH; 
    }
    
}
