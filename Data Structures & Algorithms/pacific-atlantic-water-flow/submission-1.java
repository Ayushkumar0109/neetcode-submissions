class Solution {
    int[][] directions = {
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // Pacific (top row)
        for(int c = 0; c < cols; c++) {
            dfs(0, c, heights, pacific);
        }

        // Pacific (left column)
        for(int r = 0; r < rows; r++) {
            dfs(r, 0, heights, pacific);
        }

        // Atlantic (bottom row)
        for(int c = 0; c < cols; c++) {
            dfs(rows - 1, c, heights, atlantic);
        }

        // Atlantic (right column)
        for(int r = 0; r < rows; r++) {
            dfs(r, cols - 1, heights, atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(pacific[i][j] && atlantic[i][j]) {

                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
        
    }

    private void dfs(int row, int col, int[][] heights, boolean[][] visited) {

        visited[row][col] = true;

        for(int[] dir : directions) {

            int nr = row + dir[0];
            int nc = col + dir[1];

            if(nr < 0 || nc < 0 ||
               nr >= heights.length ||
               nc >= heights[0].length)
                continue;

            if(visited[nr][nc])
                continue;

            if(heights[nr][nc] < heights[row][col])
                continue;

            dfs(nr, nc, heights, visited);
        }
    }
}
