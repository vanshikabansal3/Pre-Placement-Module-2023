class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        
        int min=prices[0],res=0;
        
        for(int i=1;i<prices.length;i++){
            if(res<prices[i]-min) res=prices[i]-min;
            if(min>prices[i]) min=prices[i];
        }
        
        return res;
    }
}
