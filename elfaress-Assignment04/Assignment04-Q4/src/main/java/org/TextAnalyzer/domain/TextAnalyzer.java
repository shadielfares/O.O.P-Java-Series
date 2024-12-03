package org.StringAnalyzer.domain;

import org.StringAnalyzer.domain.StringCleaner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Shadi El-Fares
 * November 8th, 2024
 */

public class TextAnalyzer extends StringAnalyzer {

    private StringCleaner cleaner;
    private String cleanedString;

    // Constructor that accepts a string and uses StringCleaner to preprocess it
    public TextAnalyzer(String input) {
		//Super constructor neccesary in our case to override the inital one
        super(input);
        this.cleaner = new StringCleaner();
        this.cleanedString = cleaner.cleanString(input);
    }

    // Calculates the average word length and finds the most frequently occurring letter.
    public Map<String, Object> calculateAverageWordLengthAndMostFrequentLetter() {
        String[] words = cleanedString.split(" ");
        int totalLength = 0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();

        // Calculate total length of words and letter frequencies
        for (String word : words) {
            totalLength += word.length();
            for (char letter : word.toCharArray()) {
                if (letterFrequencyMap.containsKey(letter)) {
                    letterFrequencyMap.put(letter, letterFrequencyMap.get(letter) + 1);
                } else {
                    letterFrequencyMap.put(letter, 1);
                }
            }
        }

        // Calculate average word length
        double averageWordLength = (double) totalLength / words.length;

        // Find the most frequently occurring letter
        char mostFrequentLetter = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : letterFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentLetter = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Prepare the result map
        Map<String, Object> result = new HashMap<>();
        result.put("averageWordLength", averageWordLength);
        result.put("mostFrequentLetter", mostFrequentLetter);

        return result;
    }

    // Prints all the words in the sentence in alphabetical order. Duplicate words are printed only once.
    public TreeSet<String> getWordsInAlphabeticalOrder() {
        String[] words = cleanedString.split(" ");
        TreeSet<String> sortedWords = new TreeSet<>();

        for (String word : words) {
            sortedWords.add(word);
        }

        return sortedWords;
    }
}
