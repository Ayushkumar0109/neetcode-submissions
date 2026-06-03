class Solution {
    public int maxProfit(int[] prices) {
        int result=0;
        int m=prices[prices.length-1];
        int[] s = new int[prices.length];
        for(int i=prices.length-2; i>-1;i--){
            if(prices[i] < m){
                result=Math.max(result,m-prices[i]);
            }
            m=Math.max(m,prices[i]);
        }
        return result;
        
    }
}
