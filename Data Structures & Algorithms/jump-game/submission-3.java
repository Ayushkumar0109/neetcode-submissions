class Solution {
    public boolean canJump(int[] nums) {
        int len=nums.length;
        int maxIndex=nums[0];
        
        if(maxIndex>=len-1) return true;
        for(int i=1;i<=maxIndex;i++){
            if(i+nums[i] >= len-1) return true;
            maxIndex =Math.max(maxIndex,i+nums[i]);
        }
        return false;
        
    }
}
