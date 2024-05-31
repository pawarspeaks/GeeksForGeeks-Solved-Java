class Solution {
    static int swapNibbles(int n) {
        // code here
        final int MASK = 0b1111;
        int b = n & MASK;
        b <<= 4;
        return b | (n >> 4);
    }
}
