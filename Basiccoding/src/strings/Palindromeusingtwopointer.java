package strings;

public class Palindromeusingtwopointer {

	public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
	}

}
