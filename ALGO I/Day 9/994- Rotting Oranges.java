class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer>> queue=new LinkedList<>();
        int oranges=0,count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0) ++oranges;
                if(grid[i][j]==2) {
                    queue.offer(new Pair(i,j));
                    ++count;
                }
            }
        }
        
        int res=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            boolean change=false;
            
            for(int i=0;i<len;i++){
                Pair<Integer,Integer> pair=queue.poll();
                int r=(int)pair.getKey();
                int c=(int)pair.getValue();
                
                if(r>0 && grid[r-1][c]==1){
                    change=true;
                    grid[r-1][c]=2;
                    queue.offer(new Pair(r-1,c));
                    ++count;
                }
                if(r<grid.length-1 && grid[r+1][c]==1){
                    change=true;
                    grid[r+1][c]=2;
                    queue.offer(new Pair(r+1,c));
                    ++count;
                }
                if(c>0 && grid[r][c-1]==1){
                    change=true;
                    grid[r][c-1]=2;
                    queue.offer(new Pair(r,c-1));
                    ++count;
                }
                if(c<grid[r].length-1 && grid[r][c+1]==1){
                    change=true;
                    grid[r][c+1]=2;
                    queue.offer(new Pair(r,c+1));
                    ++count;
                }
            }
            if(change) ++res;
        }
        if(count<oranges) return -1;
        return res;
    }
}
