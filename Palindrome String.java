class Solution {
    int isPalindrome(String S) {
        // code here
   return (S.equals(new StringBuffer(S).reverse().toString())) ? 1 : 0;
    }
};