class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        
        int min_ind=0;
        
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(nums[min_ind]))
                min_ind=i;
        }
        
        res[0]=nums[min_ind]*nums[min_ind];
        
        int l=min_ind-1,r=min_ind+1;
        int k=1;
        
        while(l>=0 && r<nums.length){
            if(nums[l]*nums[l]< nums[r]*nums[r]){
                res[k++]=nums[l]*nums[l];
                --l;
            }
            else{
                res[k++]=nums[r]*nums[r];
                ++r;
            }
        }
        
        while(l>=0){
            res[k++]=nums[l]*nums[l];
            --l;
        }
        
        while(r<nums.length){
            res[k++]=nums[r]*nums[r];
            ++r;
        }
        
        return res;
    }
}
