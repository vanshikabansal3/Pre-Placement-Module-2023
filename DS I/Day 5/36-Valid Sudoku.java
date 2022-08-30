class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        
        int count=0;
        for(int i=0;i<9;i++){
            set1.clear();
            set2.clear();
            for(int j=0;j<9;j++){
                if(set1.contains(board[i][j]) || set2.contains(board[j][i])) return false;
                    
                 if(board[i][j]!='.') set1.add(board[i][j]);
                 if(board[j][i]!='.') set2.add(board[j][i]); 
            }
        }
        
        for(int i=0;i<9;i+=3){
           for(int j=0;j<9;j+=3){
               
            set1.clear();
               
            for(int a=0;a<3;a++){
                for(int b=0;b<3;b++){
                    if(board[i+a][j+b]!='.' && set1.contains(board[i+a][b+j]))
                        return false;
                    
                     set1.add(board[i+a][b+j]);
                }
            }
            }
            
        }
        
        return true;
    }
}
