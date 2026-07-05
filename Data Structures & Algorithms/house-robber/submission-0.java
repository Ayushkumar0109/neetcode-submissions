class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] max = new int[len];
        max[0]=nums[0];
        max[1]=nums[1];
        int prev1=0;
        int prev2=nums[0];
        for(int i=2; i<len; i++){
            max[i]=Math.max(prev1+nums[i], prev2+nums[i]);
            prev1=max[i-2];
            prev2=max[i-1];
        }
        return Math.max(max[len-1],max[len-2]);


        
    }
}
