class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length;i++){
            Set<Integer> set1 = new HashSet();
            if(nums[i]==sum/2) return true;
            set1.add(nums[i]);
            for(Integer integer:set){
                if(integer+nums[i]==sum/2) return true;
                set1.add(integer+nums[i]);
                set1.add(integer);
            }
            set=set1;
        }
        return false;
    }
}
