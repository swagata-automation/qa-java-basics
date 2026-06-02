package strings;

import java.util.HashMap;

public class NonrepeatingChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // Step 1: Build the frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        
        // Step 2: Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i; // Found it! Return the index
            }
        }
        
        return -1; // If no unique character exists
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // Output: 0
        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
    }
}