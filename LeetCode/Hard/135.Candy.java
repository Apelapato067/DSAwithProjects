class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length; // Get the length of the ratings array
        int[] left = new int[n]; // Array to track candies from the left pass
        int[] right = new int[n]; // Array to track candies from the right pass
        Arrays.fill(left, 1); // Initialize each child with 1 candy in the left array
        Arrays.fill(right, 1); // Initialize each child with 1 candy in the right array
        
        // Traverse from left to right, giving more candies if the current child has a higher rating than the previous one
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        
        // Traverse from right to left, giving more candies if the current child has a higher rating than the next one
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        
        int ans = 0; // Variable to store the total candies
        // Take the maximum of candies from both the left and right passes for each child
        for (int i = 0; i < n; i++) {
            ans += Math.max(left[i], right[i]);
        }
        return ans; // Return the total number of candies
    }
}
