class Solution {
    public String reverseWords(String s) {
        // Create a list to hold the words.
        List<String> words = new ArrayList<>();
        int n = s.length();
        
        // Iterate through the string.
        for (int i = 0; i < n;) {
            // Skip leading spaces.
            while (i < n && s.charAt(i) == ' ') {
                ++i;
            }
            // If we've reached the end of the string, break.
            if (i < n) {
                StringBuilder t = new StringBuilder(); // To build the current word.
                int j = i; // Start position for the current word.
                
                // Collect characters until we reach a space or the end of the string.
                while (j < n && s.charAt(j) != ' ') {
                    t.append(s.charAt(j++));
                }
                
                // Add the current word to the list.
                words.add(t.toString());
                i = j; // Move to the next character after the word.
            }
        }
        
        // Reverse the list of words.
        Collections.reverse(words);
        
        // Join the words with a single space and return the result.
        return String.join(" ", words);
    }
}
