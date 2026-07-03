package strings;

public class ReverseSentence {

    public static void main(String[] args) {

        String input = "Selenium with Java and Docker";

        // Step 1: Split the string by spaces into an array of words
        String[] words = input.split(" ");

        // StringBuilder is preferred for building strings efficiently
        StringBuilder reversedSentence = new StringBuilder();

        // Step 2: Loop backwards from the last word to the first word
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            // Add a space between words, but not after the last word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        // Step 3: Print the result
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedSentence.toString());
    }
}