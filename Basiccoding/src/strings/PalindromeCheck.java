package strings;

public class PalindromeCheck {

	public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
            
        }

        System.out.println("Reversed string is: " + reversed);

     // check palindrome
        if (input.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }	
        
	}

}
