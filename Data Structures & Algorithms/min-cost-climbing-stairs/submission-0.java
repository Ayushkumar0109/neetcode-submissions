class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
       
        int[] ans = new int[len];
        if(len==2){
            return Math.min(cost[0],cost[1]);
        }
        ans[0]=cost[0];
        ans[1]=cost[1];
        for(int i=2; i<len; i++){
            ans[i]=Math.min(ans[i-1] + cost[i] , ans[i-2] + cost[i]);
        }
        return Math.min(ans[len-1], ans[len-2]);
        
    }
}
