class Solution {
    public List<Integer> partitionLabels(String s) {
        int len=s.length();
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<len;i++){
            char a= s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Set<Character> set = new HashSet();
        int curr=0;
        List<Integer> list = new ArrayList();
        
        for(int i=0;i<len;i++){
            if(set.size()==0 && i!=0){
                list.add(i-curr);
                curr=i;
            }
            char ch = s.charAt(i);
            set.add(ch);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                set.remove(ch);
            }
        }
        list.add(len-curr);
        return list;

    }
}
