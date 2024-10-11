// This function compresses a character array by replacing sequences of the same character with the character followed by its count
class Solution {
    public int compress(char[] chars) {
        int k = 0, n = chars.length;

        // Iterate through the character array
        for (int i = 0, j = i + 1; i < n;) {
            // Count the number of consecutive characters
            while (j < n && chars[j] == chars[i]) {
                ++j;
            }

            // Store the current character
            chars[k++] = chars[i];

            // If there are consecutive characters, store their count
            if (j - i > 1) {
                String cnt = String.valueOf(j - i);
                for (char c : cnt.toCharArray()) {
                    chars[k++] = c;
                }
            }

            // Move to the next group of characters
            i = j;
        }

        // Return the new length of the compressed character array
        return k;
    }
}
