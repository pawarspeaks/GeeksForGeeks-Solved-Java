class Solution {
    public static String oddEven(String s) {
        // code here
              // Step 1: Initialize x and y
        int x = 0, y = 0;
        
        // Step 2: Count frequencies of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Step 3: Determine x and y based on conditions
        for (char ch : freqMap.keySet()) {
            int position = ch - 'a' + 1; // Alphabet position from 1 to 26
            int frequency = freqMap.get(ch);
            
            if (position % 2 == 0) { // Even position
                if (frequency % 2 == 0) { // Even frequency
                    x++;
                }
            } else { // Odd position
                if (frequency % 2 != 0) { // Odd frequency
                    y++;
                }
            }
        }
        
        // Step 4: Determine if (x + y) is even or odd
        int sum = x + y;
        return (sum % 2 == 0) ? "EVEN" : "ODD";
    }
}
