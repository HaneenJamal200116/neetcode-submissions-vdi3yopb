class Solution {
    public void solve(char[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;

        // mark the O's at the borders as safe !
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);
            if (board[i][COLS - 1] == 'O')
                dfs(board, i, COLS - 1);
        }
        for (int j = 0; j < COLS; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);
            if (board[ROWS-1][j] == 'O')
                dfs(board,ROWS-1, j);
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == 'O') {
                    board[i][j]='X';
                }
                else if (board[i][j] == 'T') {
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j >= grid[i].length || j < 0 || grid[i][j] != 'O')
            return;
        grid[i][j] = 'T';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
