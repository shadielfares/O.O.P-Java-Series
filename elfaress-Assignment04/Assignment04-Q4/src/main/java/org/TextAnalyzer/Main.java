package org.StringAnalyzer;

import org.StringAnalyzer.domain.TextAnalyzer;
import java.util.Map;

/**
 * Shadi El-Fares
 * Main Class
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of TextAnalyzer with a sample string
            TextAnalyzer analyzer = new TextAnalyzer("The quick brown fox jumps over the lazy dog");

            // Get words in alphabetical order
            System.out.println("Words in Alphabetical Order: " + analyzer.getWordsInAlphabeticalOrder());

            // Calculate average word length and most frequent letter
            Map<String, Object> averageWordLengthAndMostFrequentLetter = analyzer.calculateAverageWordLengthAndMostFrequentLetter();
            System.out.println("Average Word Length: " + averageWordLengthAndMostFrequentLetter.get("averageWordLength"));
            System.out.println("Most Frequent Letter: " + averageWordLengthAndMostFrequentLetter.get("mostFrequentLetter"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}