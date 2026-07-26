class Solution {
    int curr=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    curr=0;
                    dfs(grid,i,j);
                    max=Math.max(max,curr);

                }
            }
        }
        return max;
        
    }
    public void dfs(int[][] grid, int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length){
            return;
        }
        if(grid[row][col]==0){
            return;
        }
        grid[row][col]=0;
        curr++;
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
    }
}
