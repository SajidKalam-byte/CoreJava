/*Q5. Anagram Check
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1: Input: s = "anagram", t = "nagaram"
Output: true
Example 2: Input: s = "rat", t = "car"
Output: false */

import java.util.*;

class AnagramChecker {
    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // Remove extra spaces and convert to lowercase for uniformity
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();
yo
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Counting frequency of characters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Checking if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();

        // Creating an object of AnagramChecker class
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.isAnagram(s, t);

        // Display result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
