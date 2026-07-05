class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(maxProfit(nums,len,1),maxProfit(nums,len-1,0));

    
        
    }
    public int maxProfit(int[] nums,int len,int start){
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        int prev1=0;
        int prev2=nums[start];
        int[] max = new int[len];
        max[start]=nums[start];
        max[start+1]=nums[start+1];
    
        
        for(int i=start+2; i < len; i++){
            max[i]=Math.max(prev1 + nums[i],prev2 + nums[i]);
            prev1=max[i-2];
            prev2=max[i-1];
            
        }
        return Math.max(max[len-1],max[len-2]);
    }
}
