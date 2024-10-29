package ConvertDecimal;

import java.util.Scanner;
public class App {
	public class Converter{
		private int OctalConversion(int x){
			//Return string
			StringBuilder octalNumber = new StringBuilder();

			//Abs, allows us to treat negative and postive values the same
			int absoluteVal = Math.abs(x);

			//Edge Case: Entered 0
			if (x == 0){
				return(0);
			} else{
				//Perform Octal Logic until Input is no longer divisible by 8
				while (absoluteVal > 0){
					int octalRemainder = absoluteVal % 8;
					octalNumber.append(octalRemainder);
					absoluteVal /=8;
				}
			}
			int result = Integer.parseInt(octalNumber.reverse().toString());

			//Return Negative based on Input
			if (x < 0){
				return -result;
			} else{
				return result;
			}	
		}
	}
	public static void main(String[] args) {
		try{
			App app = new App();
			Converter converter = app.new Converter();

			//Instantiation of Scanner and Return Values
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an int variable between -1000 and 1000.");
			int x = scanner.nextInt();

			if (x <= 1000 && x >= -1000){
				System.out.println(converter.OctalConversion(x));
			} else {
				System.out.println("Enter a Valid Value.");
			} 
			scanner.close();
		} catch (Exception e) {
			System.out.println("Invalid Input. Use a valid entry.");
		}
	}
}
