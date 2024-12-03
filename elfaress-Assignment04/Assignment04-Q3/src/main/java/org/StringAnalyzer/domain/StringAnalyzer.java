package org.StringAnalyzer.domain;

import org.StringAnalyzer.domain.StringAnalyzer;
import java.util.HashMap;
import java.util.Map;

/**
 * Shadi El-Fares
 * November 8th, 2024
 */

public class StringAnalyzer {

	private StringCleaner cleaner;
	private String cleanedString;

	// Constructor that accepts a string and uses StringCleaner to preprocess it
	public StringAnalyzer(String input) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Input string cannot be null or empty.");
		}
		this.cleaner = new StringCleaner();
		this.cleanedString = cleaner.cleanString(input);
	}

	// Calculates the frequency of each word in the cleaned string.
	public Map<String, Integer> getWordFrequencies() {
		String[] words = cleanedString.split(" ");
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String word : words) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		return frequencyMap;
	}

	// Finds the longest word in the cleaned string.
	public String getLongestWord() {
		String[] words = cleanedString.split(" ");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		return longestWord;
	}

	// Checks if the cleaned string is a palindrome.
	public boolean isPalindrome() {
		String cleaned = cleanedString.replaceAll(" ", "");
		int length = cleaned.length();

		for (int i = 0; i < length / 2; i++) {
			if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
				return false;
			}
		}

		return true;
	}
}
