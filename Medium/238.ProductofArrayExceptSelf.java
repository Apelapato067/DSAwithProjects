class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Get the length of the input array.
        int n = nums.length;
        
        // Create an array to hold the results.
        int[] ans = new int[n];
        
        // First pass: Calculate the product of all elements to the left of each index.
        for (int i = 0, left = 1; i < n; i++) {
            ans[i] = left; // Store the left product for the current index.
            left *= nums[i]; // Update the left product by multiplying it with the current element.
        }
        
        // Second pass: Calculate the product of all elements to the right of each index.
        for (int i = n - 1, right = 1; i >= 0; --i) {
            ans[i] *= right; // Multiply the existing left product with the right product.
            right *= nums[i]; // Update the right product by multiplying it with the current element.
        }
        
        // Return the resulting array.
        return ans;
    }
}
