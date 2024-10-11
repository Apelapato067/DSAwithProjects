class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Split the sentences into words using space as the delimiter.
        var words1 = sentence1.split(" ");
        var words2 = sentence2.split(" ");
        
        // Ensure words1 is the longer or equal-length array.
        if (words1.length < words2.length) {
            var t = words1; // Temporarily store words1.
            words1 = words2; // Assign words2 to words1.
            words2 = t; // Assign the original words1 to words2.
        }

        int m = words1.length, n = words2.length;
        int i = 0, j = 0;

        // Count matching words from the beginning of both sentences.
        while (i < n && words1[i].equals(words2[i])) {
            ++i; // Increment i for each matching word.
        }

        // Count matching words from the end of both sentences.
        while (j < n && words1[m - 1 - j].equals(words2[n - 1 - j])) {
            ++j; // Increment j for each matching word.
        }

        // Return true if the combined count of matching words is at least the length of words2.
        return i + j >= n;
    }
}
