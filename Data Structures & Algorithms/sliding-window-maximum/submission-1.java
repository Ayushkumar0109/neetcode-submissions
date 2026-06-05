class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        int[] ans = new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i < k-1){
                pq.offer(nums[i]);
            }
            else{
                pq.offer(nums[i]);
                ans[j]=pq.peek();
                pq.remove(nums[j]);
                j++;
            }
        }
        return ans;

        
    }
}
