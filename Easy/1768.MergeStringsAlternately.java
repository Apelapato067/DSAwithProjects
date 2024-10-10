class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length(); // Get lengths of both input strings
        StringBuilder ans = new StringBuilder(); // StringBuilder to construct the result string
        
        // Iterate until the end of the longer string
        for (int i = 0; i < m || i < n; i++) {
            // If the current index is within the bounds of word1, append the character from word1
            if (i < m) {
                ans.append(word1.charAt(i));
            }
            // If the current index is within the bounds of word2, append the character from word2
            if (i < n) {
                ans.append(word2.charAt(i));
            }
        }
        
        return ans.toString(); // Convert the StringBuilder to a string and return it
    }
}
