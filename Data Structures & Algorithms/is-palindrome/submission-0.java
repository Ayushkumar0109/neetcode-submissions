class Solution {
    public boolean isPalindrome(String s) {
        char[] a = s.toCharArray();
        int i=0;
        int j= a.length - 1;
        while (i<=j){
            if(!Character.isLetterOrDigit(a[i])){
                i+=1;
            }
            else if(!Character.isLetterOrDigit(a[j])){
                j-=1;
            }
            else if( Character.toLowerCase(a[i]) != Character.toLowerCase(a[j])){
                System.out.println(a[i]);
                System.out.println(a[j]);
                return false;
            }
            else{
                i+=1;
                j-=1;
            }
        }
        return true;
        
    }
}
