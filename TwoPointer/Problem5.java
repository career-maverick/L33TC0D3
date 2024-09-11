package TwoPointer;
/**
 * Problem5 
 *  Given a string s, return the longest palindromic substring in s.
 * 
 * Example 1:
 *  Input: s = "babad"
 *  Output: "bab"
 *  Explanation: "aba" is also a valid answer.
 * 
 * Example 2:
 *  Input: s = "cbbd"
 *  Output: "bb"
 * 
 * Constraints:
 *  1 <= s.length <= 1000
 *  s consist of only digits and English letters. */

public class Problem5 {

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(runProblem(s));
    }
    public static String runProblem(String s){
        if (s ==null || s.length()<1) {
            return "";
        }

        int start = 0, end = 0;
        for(int index = 0; index < s.length(); index++){
            int length1 = expandFromCenter(s,index, index);
            int length2 = expandFromCenter(s, index, index + 1);
            int length = Math.max(length1, length2);

            if (length > end-start) {
                start = index - (length - 1)/2;
                end = index + length/2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right){
        while ( left >=0 && right <s.length() && s.charAt(left)== s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}