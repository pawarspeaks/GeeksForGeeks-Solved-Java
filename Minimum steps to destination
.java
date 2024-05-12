// User function Template for Java

class Solution {
     
     int minSteps(int d) {
        // code here
        int sum = 0;
        int steps = 0;
        while(sum!=d) {
            sum+=steps;
            if(sum==d)
                return steps;
            
            else if(sum>d) {
                int temp = sum-d;
                if(temp%2==0)
                    break;
            }
            ++steps;
        }


        return steps;
    }


     
}