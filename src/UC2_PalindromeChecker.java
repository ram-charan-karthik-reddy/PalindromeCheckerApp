public class UC2_PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("===== UC2: Hardcoded Palindrome Check =====");

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Word: " + word);
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Word: " + word);
            System.out.println("Result: It is NOT a Palindrome ❌");
        }

        System.out.println("Program Finished.");
    }
}