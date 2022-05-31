public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        // check for edge cases, s == null or length less than 1
        // return empty string
        // initialize ints for start and end position of palindrome
        // loop through original string
        // try to expand around center checking for cases of one or two center chars
        // length is the max value between the two cases
        // if we found a longer palindrome
        // reassign the start and end values to current palindrome
        // return substring with start and end

        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // expand around center
    // params for original string, left index, and right index (start at center)
    // make copies of left and right
    // while left and right are in range and have mirroring chars
    // expand in either direction
    // return length of expansion around center

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;

        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
