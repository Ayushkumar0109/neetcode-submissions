class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap();
        for(int val: nums){
            hash.put(val,hash.getOrDefault(val,0)+1);
        }
        //System.out.println(hash);
        List<Map.Entry<Integer,Integer>> list = new ArrayList(hash.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        //System.out.println(list);
        int[] ans = new int[k];
        int a=0;
        for(Map.Entry<Integer,Integer> entry : list){
            if(a==k){
                return ans;
            }
            else{
                ans[a]=entry.getKey();
                a+=1;
            }
        }
        return ans;
        
    }
}
