class Solution {
    public int orangesRotting(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int freshCount = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                } else if (grid[i][j] == 1)
                    freshCount++;
            }
        }
        if (freshCount == 0)
            return 0;

        int min = 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty() && freshCount > 0) {
            int size = q.size();
            min++;
            for (int i = 0; i < size; i++) {
                int curr[] = q.poll();
                // check directions from curr
                for (int[] dir : directions) {
                    int ni = curr[0] + dir[0];
                    int nj = curr[1] + dir[1];
                    if (ni < 0 || nj < 0 || ni >= ROW || nj >= COL || grid[ni][nj] != 1) {
                        continue;
                    }
                    grid[ni][nj] = 2;
                    q.offer(new int[] {ni, nj});
                    freshCount--;
                }
            }
        }

        return freshCount == 0 ? min : -1;
    }
}
