/*Q3. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:
Input: digits = ""
Output: []
Example 3:
Input: digits = "2"
Output: ["a","b","c"] */

import java.util.*;
import java.io.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';

            // Ensure valid digit range (2-9)
            if (num < 2 || num > 9) {
                System.out.println("Invalid input: Digits should be between 2-9.");
                return new ArrayList<>();
            }

            while (res.get(0).length() == i) {
                String t = res.remove(0);
                for (char c : mapping[num].toCharArray()) {
                    res.add(t + c);
                }
            }
        }
        return res;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();

        List<String> combinations = obj.letterCombinations(str);
        System.out.println(combinations);
    }
}
