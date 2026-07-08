class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int lproduct=1;
        int rproduct=1;
        int ans=nums[0];

        for(int i=0;i<len;i++){
            lproduct= lproduct==0?1: lproduct;
            rproduct= rproduct==0?1: rproduct;

            lproduct=lproduct*nums[i];
            rproduct=rproduct*nums[len-i-1];
            ans=Math.max(ans,Math.max(lproduct,rproduct));
        }
        return ans;
    }
}
/*
1 0 -3 -4 -5  0
1 0 -3 12 -60 0
    -60    20    -5  0

*/
