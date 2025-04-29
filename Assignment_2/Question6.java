/*Q6. Replace Profanity in Text
Problem Statement: A social media platform wants to automatically replace offensive words with *** in user-generated content.
Given a list of bad words, replace them in the input text. 
Example Input/Output:
Bad Words List: "bad", "ugly", "stupid"
Input: Enter text: This is a bad and ugly comment.
Output: Filtered text: This is a *** and *** comment.*/

import java.util.*;

class ProfanityFilter {
    private Set<String> badWordsSet;  // Using HashSet for faster lookup

    // Constructor to initialize bad words
    ProfanityFilter(String badWords) {
        badWordsSet = new HashSet<>();
        for (String word : badWords.toLowerCase().split(" ")) {
            badWordsSet.add(word.trim());
        }
    }

    // Method to filter profanity in the text
    public String filterText(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            // Clean word for comparison while retaining original word structure
            String cleanWord = words[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (badWordsSet.contains(cleanWord)) {
                words[i] = words[i].replaceAll("(?i)" + cleanWord, "***"); // Case-insensitive replacement
            }
        }
        return String.join(" ", words);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Input for bad words
        System.out.print("Enter the bad words (separated by spaces): ");
        String badWords = sc.nextLine();

        // Check for empty inputs
        if (text.trim().isEmpty() || badWords.trim().isEmpty()) {
            System.out.println("Error: Text or bad words list cannot be empty.");
            return;
        }

        // Creating an object of ProfanityFilter class
        ProfanityFilter filter = new ProfanityFilter(badWords);

        // Displaying modified text
        String modifiedText = filter.filterText(text);
        System.out.println("Modified text: " + modifiedText);
    }
}
