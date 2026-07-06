class Solution {
    int count=0;
    public int countSubstrings(String s) {
        int len=s.length();
        for(int i=0;i<s.length();i++){
            palindrome(s,i,len);
        }
        return count;
    }
    public void palindrome(String s, int mid, int len){
        int l1=mid-1;
        int r1=mid+1;
        int l2=mid;
        int r2=mid+1;
        while(l1 >= 0 && r1 < len){
            if(s.charAt(l1)==s.charAt(r1)){
                count+=1;
                l1--;
                r1++;
            }
            else{
                break;
            }
        }
        count+=1;
        while(l2 >= 0 && r2 < len){
            if(s.charAt(l2)==s.charAt(r2)){
                count+=1;
                l2--;
                r2++;
            }
            else{
                break;
            }
        }

    }
    
}
