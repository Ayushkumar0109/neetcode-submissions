class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if(len % groupSize!=0) return false;
        Map<Integer,Integer> map = new HashMap();
        Arrays.sort(hand);
        for(int card:hand){
            map.put(card, map.getOrDefault(card,0)+1);
        }
        for(int card:hand){
            if(map.get(card)==0){
                continue;
            }
            for(int i=0;i<groupSize;i++){
                int curr=card+i;
                if(map.getOrDefault(curr,0)==0) return false;
                map.put(curr, map.get(curr)-1);
            }
        }
        return true;        
    }
}
