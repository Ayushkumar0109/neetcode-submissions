class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates,int target,int index,List<Integer> curr,List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }
        curr.add(candidates[index]);
        backtrack(candidates,target - candidates[index], index,curr,result);
        curr.remove(curr.size() - 1);
        backtrack(candidates,target,index + 1,curr,result);
    }
}