/*Q7. Unique Characters in a String
Problem Statement:A company is developing a new security system that requires checking whether a given string has all unique characters. 
You need to write a program that:
  -Accepts a string from the user.
  -Checks if all characters in the string are unique.
Example Input/Output:
Input 1: Enter a string: abcde
Output 1: All characters are unique.
Input 2: Enter a string: hello
Output 2: String contains duplicate characters. */

import java.util.*;

class UniqueCharacterChecker {
    // Method to check if all characters in the string are unique
    public boolean hasUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqueChars.add(c)) {
                return false;  // Duplicate found
            }
        }
        return true;  // All characters are unique
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Creating an object of UniqueCharacterChecker class
        UniqueCharacterChecker checker = new UniqueCharacterChecker();

        // Checking and displaying the result
        if (checker.hasUniqueCharacters(input)) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("String contains duplicate characters.");
        }
    }
}

