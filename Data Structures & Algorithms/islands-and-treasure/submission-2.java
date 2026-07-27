class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                }
            }
        }   
    }
    public void dfs(int[][] grid, int row, int col){
        // if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
        //     return;
        // }
        if(row+1 < grid.length && grid[row+1][col] > grid[row][col]+1){
            grid[row+1][col]= grid[row][col]+1;
            dfs(grid,row+1,col);
        }
        if(row-1 >=0 && grid[row-1][col] > grid[row][col]+1){
            grid[row-1][col]= grid[row][col]+1;
            dfs(grid,row-1,col);
        }
        if(col+1 < grid[0].length && grid[row][col+1] > grid[row][col]+1){
            grid[row][col+1]= grid[row][col]+1;
            dfs(grid,row,col+1);
        }
        if(col-1 >=0 && grid[row][col-1] > grid[row][col]+1){
            grid[row][col-1]= grid[row][col]+1;
            dfs(grid,row,col-1);
        }
    }
}
  