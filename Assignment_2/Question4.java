/*Q4. Java program to find all permutations of a given String using recursion.
For example, given a String "XYZ", this program will print all 6 possible permutations
e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX */

import java.util.*;

class PermutationGenerator {
    // Recursive function to generate permutations
    void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str); // Print permutation
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);   // Swap characters
                permute(str, l + 1, r); // Recurse
                str = swap(str, l, i);   // Backtrack
            }
        }
    }

    // Corrected swap method using char array for accurate swapping
    String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();  // Taking user input

        // Creating an object of PermutationGenerator class
        PermutationGenerator generator = new PermutationGenerator();
        generator.permute(str, 0, str.length() - 1);
    }
}
