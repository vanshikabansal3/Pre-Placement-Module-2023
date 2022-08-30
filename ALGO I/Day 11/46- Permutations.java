class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        getPermutations(res,new ArrayList<Integer>(), 0, nums);
        return res;
    }
    
    public void getPermutations(List<List<Integer>> list, List<Integer> ls, int index, int []arr){
        if(index==arr.length){
            list.add(new ArrayList<Integer>(ls));
            return;
        }
        
        for(int i=index;i<arr.length;i++){
            swapNum(arr, i, index);
            
            ls.add(arr[index]);
            getPermutations(list,ls,index+1,arr);
            ls.remove(ls.size()-1);
            swapNum(arr, i, index);
        }
    }
    
    public void swapNum(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
