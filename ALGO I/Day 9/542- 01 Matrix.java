class Solution {
    public int[][] updateMatrix(int[][] mat) {  
        Queue<Pair<Integer,Integer>> queue=new LinkedList<>(); 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0) queue.offer(new Pair(i,j));
                else mat[i][j]=-1;
            }
        }
        
        int dirs[][]=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        
         while(!queue.isEmpty()){
            Pair<Integer,Integer> pair=queue.poll();
             int r=pair.getKey(),c=pair.getValue();
             
             for(int i=0;i<4;i++){
                 int x1=r+dirs[i][0];
                 int y1=c+dirs[i][1];
                 
                 if(x1>=0 && x1<mat.length && y1>=0 && y1<mat[r].length){
                     if(mat[x1][y1]==-1){
                         mat[x1][y1]=1+mat[r][c];
                         queue.offer(new Pair(x1,y1));
                     }
                 }
             }
        }
        
        return mat;
    }
}
