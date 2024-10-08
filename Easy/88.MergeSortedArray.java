class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers:
        // 'i' points to the last element of the non-empty part of nums1 (m-1).
        // 'j' points to the last element of nums2 (n-1).
        // 'k' points to the last position in nums1 (m+n-1), where elements are merged.
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            // Compare elements from nums1 and nums2, starting from the end.
            // If nums1[i] is greater, place nums1[i] at nums1[k], and decrement 'i'.
            // Otherwise, place nums2[j] at nums1[k], and decrement 'j'.
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}
