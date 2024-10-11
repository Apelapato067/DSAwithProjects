class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length; // Get the length of the input array
        Deque<Integer> stk = new ArrayDeque<>(); // Initialize a stack (deque) to store indices
        for (int i = 0; i < n; i++) {
            // If the stack is empty or the current element is less than the element at the stack's top index, push the index onto the stack
            if (stk.isEmpty() || nums[stk.peek()] > nums[i]) {
                stk.push(i);
            }
        }
        int ans = 0; // Variable to store the maximum width of the ramp
        for (int i = n - 1; i >= 0; i--) {
            // While the stack is not empty and the element at the top index of the stack is less than or equal to the current element
            while (!stk.isEmpty() && nums[stk.peek()] <= nums[i]) {
                // Update the maximum ramp width by comparing the current width (i - popped index) with the existing max width
                ans = Math.max(ans, i - stk.pop());
            }
            // If the stack is empty, break the loop (no more valid indices to consider)
            if (stk.isEmpty()) {
                break;
            }
        }
        return ans; // Return the maximum ramp width
    }
}
