class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder("");
        
        for(String word : s.split(" ")){
             char arr[]=word.toCharArray();
             reverseStr(arr);
            res.append(arr);
            res.append(" ");
        }
        
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
    
    public void reverseStr(char[] s) {
        int l=0,r=s.length-1;
        
        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            
            ++l;
            --r;
        }
    }
}
