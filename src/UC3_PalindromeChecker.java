import java.util.Scanner;

public class UC3_PalindromeChecker {

    public static boolean isPalindrome(String input) {

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse string using loop
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Compare original and reversed
        return normalized.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC3: String Reverse Palindrome Checker =====");
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
