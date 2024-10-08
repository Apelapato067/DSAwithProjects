class Solution {
    public void setZeroes(int[][] matrix) {
        // Get the number of rows (m) and columns (n) in the matrix.
        int m = matrix.length, n = matrix[0].length;
        
        // Create boolean arrays to track which rows and columns should be set to zero.
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // First pass: Identify rows and columns that contain at least one zero.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the current row and column to be set to zero.
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Second pass: Set the elements to zero based on the marked rows and columns.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current row or column is marked, set the element to zero.
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
