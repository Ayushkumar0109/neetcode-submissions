class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        int j=0;
        for(char ch: s1.toCharArray()){
            a[ch-'a']++;
            b[s2.charAt(j)-'a']++;
            j++;
        }
        int k=0;
        while(j<s2.length()){
            Boolean bool=true;
            for(int i=0; i<26; i++){
                if(a[i]!=b[i]){
                    bool=false;
                    break;
                }
            }
            if(bool==true){
                return true;
            }
            b[s2.charAt(j)-'a']++;
            j++;
            b[s2.charAt(k)-'a']--;
            k++;

        }
        for(int i=0; i<26; i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        return true;
    }
}
