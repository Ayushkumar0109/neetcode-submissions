class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            } else {
                start = 0;
            }

            end = ans.size() - 1;

            int size = ans.size();

            for (int j = start; j < size; j++) {

                List<Integer> curr = new ArrayList<>(ans.get(j));
                curr.add(nums[i]);
                ans.add(curr);
            }
        }

        return ans;
    }
}