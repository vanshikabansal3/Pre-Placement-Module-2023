class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(target>nums[mid]){
                if(mid==nums.length-1 || nums[mid+1]>target)
                    return mid+1;
                low=mid+1;
            }
            else{
                if(mid==0 || nums[mid-1]<target)
                    return mid;
                high=mid-1;
            }
        }
        return -1;
    }
}
