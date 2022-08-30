class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1) return 0;
      //  int res=-1
        for(int i=0;i<s.length();i++){
            if(s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i))) return i;
        }
        return -1;
    }
}
