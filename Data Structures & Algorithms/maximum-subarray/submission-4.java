class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int curr_max=nums[0];
        int curr=nums[0];
        int maximum=nums[0];
        for(int i=1;i<len;i++){
            curr=nums[i];
            curr_max=Math.max(curr,curr_max+nums[i]);
            maximum=Math.max(maximum,curr_max);
        }
        return maximum;
        
    }
}
