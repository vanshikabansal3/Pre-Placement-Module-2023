class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        getCombinations(res,ds,n,k,1);
        return res;
    }
    
    public void getCombinations(List<List<Integer>> res,List<Integer> ls, int n, int k, int i){
        if(ls.size()==k) {
            res.add(new ArrayList(ls));
            return;
        }
        if(i>n)
            return;
        
        ls.add(i);
        getCombinations(res,ls,n,k,i+1);
        
        ls.remove(ls.size()-1);
        getCombinations(res,ls,n,k,i+1);
    }
}
