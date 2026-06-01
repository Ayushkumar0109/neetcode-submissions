class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int[] a = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for(i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                a[0]=map.get(target-nums[i]);
                a[1]=i;
                return a;
            }
            else{
                map.put(nums[i],map.getOrDefault(map.get(i),i));
            }
        }
        a[0]=i;
        a[1]=j;
        return a;
    }
}
