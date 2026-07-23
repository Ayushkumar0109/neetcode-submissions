class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList();
        backtrack(nums,new ArrayList(),new boolean[len],ans );
        return ans; 
        
    }
    public void backtrack(int[] nums, List<Integer> curr, boolean[] used,List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }     

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            curr.add(nums[i]);
            backtrack(nums,curr,used,ans);
            curr.remove(curr.size()-1);
            used[i]=false;
        }   
    }
}
