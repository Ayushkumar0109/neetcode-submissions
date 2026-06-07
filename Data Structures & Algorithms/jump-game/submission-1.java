class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length ==1){
            return true;
        }
        int s=nums[0];
        for(int i=1; i<nums.length; i++){
            if(s >= i){
                s=Math.max(i+nums[i],s);
                if(s>=nums.length-1){
                    return true;
                }
            }
            else{
                return false;
            }

        }
        return false;
        
    }
}
