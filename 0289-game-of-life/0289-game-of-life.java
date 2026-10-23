class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // Pass 1: mark transitions using the encoding above
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di == 0 && dj == 0) continue;   // skip the cell itself
                        int r = i + di;
                        int c = j + dj;
                        if (r >= 0 && r < m && c >= 0 && c < n
                                && (board[r][c] == 1 || board[r][c] == 2)) {
                            liveNeighbors++;
                        }
                    }
                }

                if (board[i][j] == 1) {
                    // live cell dies if fewer than 2 or more than 3 neighbors
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 2;
                    }
                } else {
                    // dead cell becomes alive with exactly 3 neighbors
                    if (liveNeighbors == 3) {
                        board[i][j] = 3;
                    }
                }
            }
        }

        // Pass 2: finalize (2 -> 0, 3 -> 1)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                else if (board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
}