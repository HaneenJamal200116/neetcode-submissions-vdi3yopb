class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            dfs(image, sr, sc, color ,originalColor);
        }
        return image;
    }

    

    public void dfs(int[][] grid, int i, int j, int color, int originalColor) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length ||
                grid[i][j] != originalColor) {
            return;
        }
        grid[i][j] = color;

        dfs(grid, i + 1, j, color, originalColor);
        dfs(grid, i - 1, j, color, originalColor);
        dfs(grid, i, j + 1, color, originalColor);
        dfs(grid, i, j - 1, color, originalColor);
    }
}