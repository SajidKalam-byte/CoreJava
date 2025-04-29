/*Q9. Convert Sentence to Title Case
Problem Statement: A content editing software needs a function to convert a sentence into title case (i.e., the first letter of each word should be uppercase).
Example Input/Output:
Input: Enter sentence: java programming is fun
Output: Title Case: Java Programming Is Fun */

import java.util.*;

class TitleCaseConverter {
    // Method to convert sentence to title case
    String convertToTitleCase(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return ""; // Handle empty input
        }

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { // Prevent index error for extra spaces
                words[i] = words[i].substring(0, 1).toUpperCase() + 
                           words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}

public class Question9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        // Creating an object of TitleCaseConverter class
        TitleCaseConverter converter = new TitleCaseConverter();
        String titleCaseSentence = converter.convertToTitleCase(sentence);

        System.out.println("Title Case: " + titleCaseSentence);
    }
}
