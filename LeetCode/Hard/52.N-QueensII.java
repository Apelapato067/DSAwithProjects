class Solution {
    // Variables for the board size and the solution count.
    private int n;
    private int ans;

    // Arrays to track columns, diagonals, and anti-diagonals where queens are placed.
    private boolean[] cols = new boolean[10]; // Tracks if a queen is placed in a column.
    private boolean[] dg = new boolean[20];   // Tracks if a queen is placed on a major diagonal (i + j).
    private boolean[] udg = new boolean[20];  // Tracks if a queen is placed on a minor diagonal (i - j + n).

    // Entry function to calculate the total number of solutions to the N-Queens problem.
    public int totalNQueens(int n) {
        this.n = n; // Set board size.
        dfs(0);     // Start the depth-first search (DFS) from the first row.
        return ans; // Return the number of valid solutions.
    }

    // Depth-first search function to try placing queens row by row.
    private void dfs(int i) {
        // If all queens are placed (i == n), increment the solution count.
        if (i == n) {
            ++ans;
            return;
        }

        // Try placing a queen in each column of the current row.
        for (int j = 0; j < n; j++) {
            int a = i + j, b = i - j + n; // Calculate the indices for diagonal and anti-diagonal checks.

            // If a queen already exists in the same column or diagonals, skip this position.
            if (cols[j] || dg[a] || udg[b]) {
                continue;
            }

            // Mark the column, diagonal, and anti-diagonal as occupied by a queen.
            cols[j] = true;
            dg[a] = true;
            udg[b] = true;

            // Recursively place a queen in the next row.
            dfs(i + 1);

            // Backtrack: unmark the column, diagonal, and anti-diagonal after exploring this path.
            cols[j] = false;
            dg[a] = false;
            udg[b] = false;
        }
    }
}
