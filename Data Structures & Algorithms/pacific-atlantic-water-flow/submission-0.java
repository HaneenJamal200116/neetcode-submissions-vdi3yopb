class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int COLS = heights[0].length;
        int ROWS = heights.length;
        boolean pac[][] = new boolean[ROWS][COLS];
        boolean atl[][] = new boolean[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            dfs(heights, pac, i, 0, Integer.MIN_VALUE);
            dfs(heights, atl, i, COLS - 1, Integer.MIN_VALUE);
        }

        for (int i = 0; i < COLS; i++) {
            dfs(heights, pac, 0, i, Integer.MIN_VALUE);
            dfs(heights, atl, ROWS - 1, i, Integer.MIN_VALUE);
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (pac[i][j] && atl[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }

        return res;
    }
    public void dfs(int[][] heights, boolean[][] ocean, int i, int j, int prevH) {
        // check if out of bound
        if (i < 0 || i >= heights.length || j < 0 || j >= heights[i].length || heights[i][j] < prevH || ocean[i][j]) {
            return;
        }

        ocean[i][j] = true;
        dfs(heights,ocean, i + 1, j,heights[i][j] );
        dfs(heights,ocean, i - 1, j,heights[i][j]);
        dfs(heights,ocean, i, j + 1,heights[i][j]);
        dfs(heights,ocean, i, j - 1,heights[i][j] );
    }
}
