class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1)
                  res=(int)Math.max(res,getArea(grid,i,j));  
            }
        }
        return res;
    }
    
    public int getArea(int [][]grid, int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[r].length) return 0;
        if(grid[r][c]==0) return 0;
        
        grid[r][c]=0;
        
        return 1+getArea(grid,r-1,c)+getArea(grid,r+1,c)+getArea(grid,r,c+1)+getArea(grid,r,c-1);
    }
}
