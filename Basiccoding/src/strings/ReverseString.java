package strings;

public class ReverseString {

    public static void main(String[] args) {

        String input = "Hello";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
            
        }

        
        System.out.println("Reversed string is: " + reversed);
    }
}