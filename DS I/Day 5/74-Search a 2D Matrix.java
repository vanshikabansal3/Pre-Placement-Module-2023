class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int res=0;
        
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]){
                int l=0,h=matrix[i].length-1;
                
                while(l<=h){
                    int mid=l+(h-l)/2;
                    
                    if(target==matrix[i][mid]) return true;
                    
                    else if(target>matrix[i][mid]) l=mid+1;
                    else h=mid-1;
                }
            }
        }
        
        return false;
    }
}
