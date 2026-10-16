class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];

        int row = 0, col = 0;
        boolean up = true; // true = moving up-right, false = moving down-left

        for (int k = 0; k < m * n; k++) {
            result[k] = mat[row][col];

            if (up) {
                if (col == n - 1) {        // hit right edge -> go down
                    row++;
                    up = false;
                } else if (row == 0) {     // hit top edge -> go right
                    col++;
                    up = false;
                } else {                   // keep moving up-right
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {        // hit bottom edge -> go right
                    col++;
                    up = true;
                } else if (col == 0) {     // hit left edge -> go down
                    row++;
                    up = true;
                } else {                   // keep moving down-left
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}