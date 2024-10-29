package TrianglePattern;

import java.util.Scanner;
public class App {
	private void Tree(int n){
		//Nested-Loops to traverse height and length of tree
		for (int y = 0; y <= n; y++){
			for (int x = 1; x <= y; x++){
				System.out.print(x);
			}
			System.out.println();
		}
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

				//Output Tree
				app.Tree(n);
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
