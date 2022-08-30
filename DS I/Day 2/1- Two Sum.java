class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && nums[i]+nums[i]==target) 
                return new int[]{i,map.get(nums[i])};
            
            map.put(nums[i],i);
            
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
        }
        
        return new int[]{0,1};
    }
}