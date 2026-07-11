class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int i=0;
        int j=1;
        int maximum=0;
        while(j < len){
            int k=0;
            while(k<j){
                if(nums[k] < nums[j]){
                    dp[j]=Math.max(dp[j],1+dp[k]);
                    maximum=Math.max(dp[j],maximum);
                }
                k++;
            }
            j++;
        }
        return maximum+1;

        
    }
}
