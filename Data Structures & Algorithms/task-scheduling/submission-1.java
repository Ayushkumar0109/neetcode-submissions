class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Character> pq = new PriorityQueue();
        int maxFreq=0;
        int maxCount=0;
        for(char ch: tasks){
            pq.offer(ch);
        }
        int count=1;
        while(pq.size()>0){
            char ch = pq.poll();
            while(pq.size()>0 && pq.peek()==ch){
                pq.poll();
                count++;
            }
            if(count==maxFreq){
                maxCount+=1;
            }
            else if(count > maxFreq ){
                maxFreq=count;
                maxCount=1;
            }
            count=1;   
        }
        return Math.max(tasks.length, (maxFreq - 1) * (n + 1) + maxCount);
        
    }
}

