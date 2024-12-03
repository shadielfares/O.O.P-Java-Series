package org.StringCleaner.domain;

/**
 * Shadi El-Fares
 * Basically removes punctuation, extra spaces,converts to lowercase for a specified string
 * November 8th, 2024
 */
public class StringCleaner {

	// Removes all punctuation characters from the given string.
	public String removePunctuation(String input) {
		if (input == null) {
			return null;
		}
		// Uses the Punctuation capture group in regex
		String regex = "[\\p{Punct}]";
		// Replace all punctuation characters with an empty string
		String result = input.replaceAll(regex, "");
		return result;
	}

	// Converts the entire string to lowercase.
	public String convertToLowercase(String input) {
		if (input == null) {
			return null;
		}
		String lower = input.toLowerCase();
		return lower;
	}

	// Removes leading, trailing, and extra spaces between words in the string.
	public String removeExtraSpaces(String input) {
		if (input == null) {
			return null;
		}
		// Ok so this regex portion looks for ONE OR MORE whitespace characters and
		// replaces it with one space
		// Trim leading and trailing spaces
		String trimmed = input.trim();
		// Replace multiple spaces with a single space
		String result = trimmed.replaceAll("\\s+", " ");
		return result;
	}

	public String cleanString(String input) {
		if (input == null) {
			return null;
		}

		String removedPunctuation = removePunctuation(input);
		String lower_removePunctuation = convertToLowercase(removedPunctuation);
		String cleaned = removeExtraSpaces(lower_removePunctuation);
		return cleaned;
	}
}