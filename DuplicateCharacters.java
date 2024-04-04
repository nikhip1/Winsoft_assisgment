/*Q4:Write a Java Program to find the duplicate characters in a string. */

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCountMap = countCharacters(str);
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }

    public static HashMap<Character, Integer> countCharacters(String str) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
