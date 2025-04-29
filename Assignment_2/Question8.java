/*Q8. Find the Longest Word
Problem Statement: A book editor tool requires a function to find the longest word in a given sentence.
Example:
Input: Enter sentence: Innovation distinguishes between a leader and a follower.
Output: Longest Word: distinguishes */

import java.util.*;

class LongestWordFinder {
    // Method to find the longest word in the given sentence
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            // Remove punctuation for accurate word comparison
            word = word.replaceAll("[^a-zA-Z]", ""); 
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        // Creating object of LongestWordFinder class
        LongestWordFinder finder = new LongestWordFinder();
        String longestWord = finder.findLongestWord(sentence);

        System.out.println("Longest Word: " + longestWord);
    }
}


