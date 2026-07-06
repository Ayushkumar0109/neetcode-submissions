// class Solution {
//     int[] ans = new int[2];
//     public String longestPalindrome(String s) {
//         int i=0;
//         int j=s.length()-1;
//         recursion(s,i,j);
//         return s.substring(ans[0],ans[1]+1);
        
//     }
//     public void recursion(String s,int start, int end){
//         if(start>=end){
//             return;
//         }
//         if(isPalindrome(s,start,end) ){
//             if(end-start > ans[1]-ans[0]){
//                 ans[0]=start;
//                 ans[1]=end;
//             }
//             return;
//         }
//         recursion(s,start+1,end);
//         recursion(s,start,end-1);
        
//     }
//     public boolean isPalindrome(String s,int left, int right) {

//         while (left < right) {

//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }

class Solution {

    int start = 0, maxLen = 0;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);     // odd
            expand(s, i, i + 1); // even
        }

        return s.substring(start, start + maxLen);
    }

    private void expand(String s, int l, int r) {

        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {

            l--;
            r++;
        }

        l++;
        r--;

        if (r - l + 1 > maxLen) {
            start = l;
            maxLen = r - l + 1;
        }
    }
}
