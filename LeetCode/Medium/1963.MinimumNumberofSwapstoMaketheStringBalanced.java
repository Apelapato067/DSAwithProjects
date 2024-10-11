class Solution {
    public int minSwaps(String s) {
        int x = 0; // Counter for unmatched opening brackets '['.
        
        // Iterate through each character in the string.
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            
            // Increment the counter for every opening bracket '['.
            if (c == '[') {
                ++x;
            } 
            // For every closing bracket ']', decrement the counter if there are unmatched '['.
            else if (x > 0) {
                --x;
            }
        }
        
        // Return the minimum number of swaps needed to balance the brackets.
        // Each swap can fix two unmatched brackets.
        return (x + 1) / 2;
    }
}
