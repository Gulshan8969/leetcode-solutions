class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int r = 0, c = 0;
        visited[0][0] = true;

        while (true) {
            int nr = r, nc = c;
            char ch = grid[r][c];
            if (ch == 'L') nc--;
            else if (ch == 'R') nc++;
            else if (ch == 'U') nr--;
            else nr++;                       // 'D'

            if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) {
                break;
            }
            r = nr;
            c = nc;
            visited[r][c] = true;
        }
        return new int[]{r, c};
    }
}