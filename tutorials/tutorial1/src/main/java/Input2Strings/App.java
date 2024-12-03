package Input2Strings;

import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Need to get 2 inputs
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        // Compare the 2
        if (string1.compareTo(string2) > 0) {
            System.out.printf("String 1 is larger%n");
        } else if (string1.compareTo(string2) < 0) {
            System.out.printf("String 2 is larger%n");
        } else {
            System.out.printf("They are equivalent%n");
        }

        // 3 Concat them
        String result_concat = string1.concat(string2);

        // 4
        int len1 = string1.length();
        int len2 = string2.length();

        System.out.printf("Length 1: %d and Length 2: %d%n", len1, len2);

        // Close the scanner
        scanner.close();
    }
}
