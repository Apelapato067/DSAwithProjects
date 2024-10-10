// This function calculates how much water can be trapped between the buildings
class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Initialize arrays to store maximum heights to the left and right of each index
        int[] left = new int[n];
        int[] right = new int[n];

        // Precompute the maximum height from the left for each index
        left[0] = height[0];
        right[n - 1] = height[n - 1];

        // Fill the left and right arrays
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
            right[n - i - 1] = Math.max(right[n - i], height[n - i - 1]);
        }

        int ans = 0;

        // Calculate the trapped water at each index
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - height[i];
        }

        // Return the total trapped water
        return ans;
    }
}
