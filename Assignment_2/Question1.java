/*Q1. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings. If there is no common
prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","race","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

public class Question1 {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "dlight"};
        Solution solution = new Solution();
        System.out.println("Output: " + solution.longestCommonPrefix(strs));
    }
}
