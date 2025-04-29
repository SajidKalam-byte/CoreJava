/*Q2. Password Checker
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string
str is valid password else 0.
str is a valid password if it satisfies the below conditions.
– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption: Input string will not be empty.
Example:
Input:aA1_67
Output:1
Sample Input: a987 abC012
Output:0 */

import java.util.*;

class code {
    void CheckPassword(String str, int n) {
        if (n < 4) {
            System.out.println("0");  // Condition: At least 4 characters
            return;
        }

        if (Character.isDigit(str.charAt(0))) {
            System.out.println("0");  // Condition: First character must not be a number
            return;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (ch == ' ' || ch == '/') {
                System.out.println("0");  // Condition: No spaces or slashes
                return;
            }
        }

        if (hasDigit && hasUpperCase) {
            System.out.println("1");  // Valid password
        } else {
            System.out.println("0");  // Missing required conditions
        }
    }
}


public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        code obj = new code();
        obj.CheckPassword(str, n);
    }
}
