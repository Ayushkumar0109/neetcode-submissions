class Solution {

    public int numDecodings(String s) {
        int len = s.length();
        int[] ans = new int[len+1];
        ans[0]=1;
        ans[1]= s.charAt(0)=='0' ? 0:1;
        for(int i=2;i<=len;i++){
            int singledigit = Integer.parseInt(s.substring(i-1,i));
            int doubledigit = Integer.parseInt(s.substring(i-2,i));
            if(singledigit>=1){
                ans[i]+=ans[i-1];
            }
            if(doubledigit>=10 && doubledigit<=26){
                ans[i]+=ans[i-2];
            }
        }
        return ans[len];
    
    }

    
}