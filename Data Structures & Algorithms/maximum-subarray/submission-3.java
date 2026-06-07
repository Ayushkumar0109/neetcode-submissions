class Solution {
    public int maxSubArray(int[] nums) {
        int max=-100000;
        int curr_max=0;
        int j=0;
        while(j < nums.length){
            curr_max+=nums[j];
            max=Math.max(curr_max,max);
            j+=1;
            if(curr_max < 0){
                curr_max=0;
            }
        }
        return max;
        
    }
}

//.     2, -3, 4, -2, 2, 1, -1, 4
//curr  2.  0  4.  2. 4. 5.  4  8
//      2.  2. 4.  4. 4  5.  5. 8
