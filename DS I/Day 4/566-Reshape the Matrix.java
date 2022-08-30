class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r==mat.length && c==mat[0].length) return mat;
        
        if(r*c != mat.length*mat[0].length) return mat;
        
        int res[][]=new int[r][c];
        int a=0,b=0;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(b==c){
                    b=0;
                    a+=1;
                }
                res[a][b++]=mat[i][j];
            }
        }
        return res;
    }
}
