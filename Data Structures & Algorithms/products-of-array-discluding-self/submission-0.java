class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result= new int[nums.length];
        int zeroCount=0;
        int p=1;
        for(int val : nums){
            if(val!=0){
                p=p*val;
            }
            else{
                zeroCount+=1;
            }
        }
        if(zeroCount==0){
            for(int i=0;i<nums.length;i++){
                result[i]=p/nums[i];
            }
        }
        else if(zeroCount==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    result[i]=p;
                }
                else{
                    result[i]=0;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                result[i]=0;
            }
        }
        return result;
        
    }
}  
