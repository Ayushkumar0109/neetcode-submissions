class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int kth=0;
    public KthLargest(int k, int[] nums) {
        for(int number : nums){
            pq.add(number);
        }
        kth=k;
    }
    
    public int add(int val) {
        pq.offer(val);
        int[] a = new int[kth];
        int i=0;
        while(i<kth){
            a[i]=pq.poll();
            i++;            
        }
        for(int ch: a){
            pq.add(ch);
        }
        return a[kth-1];
        
    }
}
