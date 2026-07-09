public class Palindrome {

    // Method to check whether the given string is a palindrome
    public static boolean isPalindrome(String s) {

        // First character index
        int left = 0;

        // Last character index
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {

            // If characters are not equal, it is not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // Move left pointer forward
            left++;

            // Move right pointer backward
            right--;
        }

        // If all characters matched
        return true;
    }

    public static void main(String[] args) {

        // Input string
        String str = "madam";

        // Check whether the string is palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}