class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int max_profit = 0;
        int msf = prices[0];
        
        for(int i=0; i<prices.length; i++){
            msf = Math.min(msf,prices[i]);
            diff = prices[i]-msf;
            max_profit = Math.max(max_profit, diff);
        }
        return max_profit;
        
    }
}
