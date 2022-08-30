class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
        
        getPermutations(res,s,0,new StringBuilder(""));
        return res;
    }
    
    public void getPermutations(List<String> res,String s, int i,StringBuilder temp){
       
        if(i==s.length()){
            res.add(temp.toString());
            return ;
        }
       
            if(Character.isDigit(s.charAt(i))) { 
                 temp.append(s.charAt(i));
                 getPermutations(res,s,i+1,temp);
                temp.deleteCharAt(temp.length()-1);
            }
        
        
            else{
                temp.append(Character.toLowerCase(s.charAt(i)));
                getPermutations(res,s,i+1,temp);
                temp.deleteCharAt(temp.length()-1);
                
                temp.append(Character.toUpperCase(s.charAt(i)));
                getPermutations(res,s,i+1,temp);
                temp.deleteCharAt(temp.length()-1);
            }
    }
}
