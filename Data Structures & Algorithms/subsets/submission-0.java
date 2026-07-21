class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        for(int num:nums){
            List<List<Integer>> copy = new ArrayList();
            for (List<Integer> b : ans) {

                List<Integer> subset1 = new ArrayList<>(b);

                List<Integer> subset2 = new ArrayList<>(b);
                subset2.add(num);

                copy.add(subset1);
                copy.add(subset2);
            }
            ans = new ArrayList(copy);
        }
        return ans;
        
    }
}
