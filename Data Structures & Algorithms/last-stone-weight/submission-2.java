class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int s= Math.abs(a-b);
            if(s > 0) pq.add(s);

        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}
