class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int val: nums ){
            set.add(val);
        } 

        int longest=0;
        for (int val:nums){
            int currValue=val+1;
            int l=1;
            if(!set.contains(val-1)){
                while(set.contains(currValue)){
                    currValue+=1;
                    l+=1;
                }
            }
            longest=Math.max(l,longest);
        }
        return longest;   
    }
}



