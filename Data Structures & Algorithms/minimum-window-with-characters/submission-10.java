class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        HashMap<Character,Integer> hash = new HashMap();
        HashMap<Character,Integer> hash1 = new HashMap();
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int l=1000000;
        int matches=0;
        for(char ch: t.toCharArray()){
            hash1.put(ch,hash1.getOrDefault(ch,0)+1);
        }
        int size = hash1.size();
        int i=0;
        int j=-1;
        for(char val: s.toCharArray()){
            j+=1;
            hash.put(val,hash.getOrDefault(val,0)+1);
            if(hash.get(val)==hash1.get(val)){
                matches++;
            }
            
            if(size==matches){
                System.out.println(val);
                System.out.println(i);
                System.out.println(j);

                
                while(matches==size){
                    if(j-i+1 < l){
                        l= j-i+1;
                        ans[0]=i;
                        ans[1]=j;
                    }
                    hash.put(s.charAt(i),hash.get(s.charAt(i))-1);
                    if(hash1.get(s.charAt(i))!=null &&  hash1.get(s.charAt(i)) >  hash.get(s.charAt(i))){
                        matches--;
                    }
                
                    i+=1;
                }
                while(i< j && hash1.get(s.charAt(i))==null){
                    i+=1;
                }

            }

        }
        if(ans[0]==-1 && ans[1]==-1){
            return "";
        }
        return s.substring(ans[0],ans[1]+1);

    }
}
