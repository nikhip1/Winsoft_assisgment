
/*Q3:Write a Java Program to count the number of words in a string using HashMap.*/

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String str = "This is a sample string with repeated words. This string will be used to demonstrate word counting.";
        HashMap<String, Integer> wordCountMap = countWords(str);
        
        // Print word counts
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            // Remove punctuation marks and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (word.length() > 0) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}
