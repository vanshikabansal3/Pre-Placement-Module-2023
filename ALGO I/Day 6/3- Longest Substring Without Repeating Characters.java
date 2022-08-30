class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        
        int pre[]=new int[256];
        Arrays.fill(pre,-1);
        
        int res=0;int i=0;
        
        for(int j=0;j<s.length();j++){
            i=(int)Math.max(i,pre[s.charAt(j)]+1);
            int max=j-i+1;
            res=(int)Math.max(res,max);
            pre[s.charAt(j)]=j;
        }
        
        return res;
    }
}
