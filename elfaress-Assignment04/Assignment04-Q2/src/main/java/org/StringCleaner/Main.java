package org.StringCleaner;

import org.StringCleaner.domain.StringCleaner;

/**
 * Shadi El-Fares
 * Main Class
 */
public class Main {
	public static void main(String[] args) {
		StringCleaner cleaner = new StringCleaner();
		String text = "  Hello, World! How's it going?  ";
		String cleanedText = cleaner.cleanString(text);
		System.out.println("Cleaned Text: " + cleanedText);
	}
}