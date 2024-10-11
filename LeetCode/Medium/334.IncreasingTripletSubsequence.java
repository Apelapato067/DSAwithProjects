class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length; // Get the length of the input array
        int[] lmi = new int[n]; // Array to track the minimum element to the left of each index
        int[] rmx = new int[n]; // Array to track the maximum element to the right of each index
        
        lmi[0] = Integer.MAX_VALUE; // Initialize the first element in lmi to a large value
        rmx[n - 1] = Integer.MIN_VALUE; // Initialize the last element in rmx to a small value
        
        // Fill lmi with the minimum element to the left of each index
        for (int i = 1; i < n; i++) {
            lmi[i] = Math.min(lmi[i - 1], nums[i - 1]);
        }
        
        // Fill rmx with the maximum element to the right of each index
        for (int i = n - 2; i >= 0; i--) {
            rmx[i] = Math.max(rmx[i + 1], nums[i + 1]);
        }
        
        // Check if there exists a triplet such that lmi[i] < nums[i] < rmx[i]
        for (int i = 0; i < n; i++) {
            if (lmi[i] < nums[i] && nums[i] < rmx[i]) {
                return true; // Return true if such a triplet is found
            }
        }
        
        return false; // Return false if no valid triplet is found
    }
}
