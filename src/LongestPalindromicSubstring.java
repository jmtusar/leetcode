/*
5. Longest Palindromic Substring
Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
Seen this question in a real interview before?
1/5
Yes
No
Accepted
3.2M
Submissions
9.4M
Acceptance Rate
34.2%
Topics
Two Pointers
String
Dynamic Programming
Companies
Hint 1
How can we reuse a previously computed palindrome to compute a larger palindrome?
Hint 2
If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?
Hint 3
Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int len = Math.max(odd, even);
            if(len > end-start){
                //Even len (6)-> 2 start --> i-2, end -> i+3
                //Odd len (5) -> 2 start i-2, end -> i+2
                start = i - (len-1)/2;
                end = i+ len/2;
            }
        }
        return s.substring(start, end+1);
    }
    int expand(String s, int left, int right){
        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {

    }
}
