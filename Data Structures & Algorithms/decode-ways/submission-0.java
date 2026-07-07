class Solution {

    Integer[] memo;

    public int numDecodings(String s) {

        memo = new Integer[s.length()];

        return decode(s, 0);
    }

    private int decode(String s, int index) {

        if (index == s.length()) {
            return 1;
        }

        if (s.charAt(index) == '0') {
            return 0;
        }

        if (memo[index] != null) {
            return memo[index];
        }

        int ways = decode(s, index + 1);

        if (index + 1 < s.length()) {

            int num = Integer.parseInt(
                s.substring(index, index + 2)
            );

            if (num >= 10 && num <= 26) {
                ways += decode(s, index + 2);
            }
        }

        memo[index] = ways;

        return ways;
    }
}