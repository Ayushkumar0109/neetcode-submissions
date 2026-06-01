class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();
        for(String s : strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                List<String> s1= map.get(key);
                s1.add(s);
                map.put(key,s1);
            }
            else{
                List<String> s1 = new ArrayList();
                s1.add(s);
                map.put(key,s1);
            }


        }
        List<List<String>> ans = new ArrayList();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
    }
}
