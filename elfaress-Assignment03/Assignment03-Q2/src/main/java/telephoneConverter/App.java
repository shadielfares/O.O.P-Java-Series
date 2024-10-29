package telephoneConverter;

import java.util.Scanner;
/**
 * Input a 10-character telephone number in format XXX-XXX-XXX
 * Print on screen NUMERICAL Telephone Number
 */
public class App {
	
	//Input Method
	public static String retrieveInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a telephone number: ");
		String telephone = scanner.next();
		scanner.close();
		//Ensure proper group capture
		return telephone.toUpperCase();
	}

	public static String telephoneConverter(String telephone){
		//Declare Converted String
		String convertedTelephone = telephone;

		// Replace letter groups with corresponding numbers
		convertedTelephone = convertedTelephone.replaceAll("[ABC]", "2");
		convertedTelephone = convertedTelephone.replaceAll("[DEF]", "3");
		convertedTelephone = convertedTelephone.replaceAll("[GHI]", "4");
		convertedTelephone = convertedTelephone.replaceAll("[JKL]", "5");
		convertedTelephone = convertedTelephone.replaceAll("[MNO]", "6");
		convertedTelephone = convertedTelephone.replaceAll("[PQRS]", "7");
		convertedTelephone = convertedTelephone.replaceAll("[TUV]", "8");
		convertedTelephone = convertedTelephone.replaceAll("[WXYZ]", "9");

		return convertedTelephone;
	}

	public static void main(String[] args) {
		String input = retrieveInput();
		String output = telephoneConverter(input);
		System.out.printf("The phone number for %s is %s. \n", input, output);
	}
}
