class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int count = 0;
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j >= grid[i].length || j < 0 || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;

        return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j + 1)
            + dfs(grid, i, j - 1);
    }
}
