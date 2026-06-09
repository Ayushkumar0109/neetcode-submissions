class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int l=0;
        int r=0;
        while(r < nums.length-1){
            int m=0;
            for(int i=l;i<=r;i++){
                m=Math.max(m,nums[i]+i);
            }
            l+=1;
            r=Math.max(m,r);
            jump+=1;
        }
        return jump;
        
    }
}
