package PrintValues;

import java.util.Scanner;
public class App {
	private String[] Modulator(int n){
		// Initialize Strings
		StringBuilder numbers3 = new StringBuilder(), numbers5 = new StringBuilder(), numbers3_5 = new StringBuilder();

		// Modulus Logic
		for (int i = 0; i <= n; i++){
			if (i % 3 == 0 && i % 5 == 0 && i != 0){
				numbers3_5.append(i).append(", ");
			} if (i % 3 == 0){
				numbers3.append(i).append(", ");
			} if (i % 5 == 0){
				numbers5.append(i).append(", ");
			}
		}

		// Remove trailing commas and spaces
		if (numbers3.length() > 0) {
			numbers3.setLength(numbers3.length() - 2);
		}
		if (numbers5.length() > 0) {
			numbers5.setLength(numbers5.length() - 2);
		}
		if (numbers3_5.length() > 0) {
			numbers3_5.setLength(numbers3_5.length() - 2);
		}

		return new String[] {numbers3.toString(), numbers5.toString(), numbers3_5.toString()};
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			//Scanner Input
			System.out.println("Enter a number between 1 and 200.");
			int n = scanner.nextInt();

			if (n <= 200 && n >= 1) {
				//App Instance
				App app = new App();

				//Allow Modulator Function results to be accessed as indicies
				String[] result = app.Modulator(n);
				System.out.printf("Divided by 3 -> %s. \nDivided by 5 -> %s. \nDivided by 3 and 5 -> %s.", result[0], result[1], result[2]);
			} else{

				System.out.println("Enter between the ranges.");
			} 
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid entry.");
		} finally {
			scanner.close();
		}
	}
}
