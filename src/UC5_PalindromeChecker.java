import java.util.Scanner;
import java.util.Stack;

public class UC5_PalindromeChecker {

    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Normalize string (remove spaces and convert to lowercase)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Push characters into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare original string with popped characters
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC5: Stack-Based Palindrome Checker =====");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The string is a Palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}