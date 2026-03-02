import java.util.Scanner;

public class UC4_PalindromeChecker {

    public static boolean isPalindrome(String input) {

        // Normalize string (remove spaces and convert to lowercase)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Convert string to character array
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // Two-pointer comparison
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC4: Character Array Palindrome Checker =====");
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