package org.StatsCalc.domain;

import java.util.Arrays;

/**
 * Shadi El-Fares
 * Basically this takes in an integer Array and has calculateMedian and calculateAverage regarding manipulation.
 * There is also a Getter: accessArray
 * Setter: updateArray
 */
public class StatisticsCalculator{

	private double[] numbers;
	//Constructor Class for StatsCalc...
	public StatisticsCalculator(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			emptyArrayException();	
		}

		//This is basically the fastest way I found to cast the whole array
		//It takes the array and process it to a stream, then casts the stream as a double and returns it back to an Array
		this.numbers = Arrays.stream(numbers).asDoubleStream().toArray();
	}

	// Method to throw exception
	public void emptyArrayException(){ 
		throw new IllegalArgumentException("Invalid input. Array cannot be null or empty.");
	}

	// Method for attempting operation on empty array
	public void operationOnEmptyArrayException(){ 
		throw new IllegalArgumentException("Array is empty.Cannot perform operation.");
	}



	// Calculates the average of the numbers in the array.
	public double calculateAverage() {
		if (numbers.length == 0) {
			operationOnEmptyArrayException();
		}
		//Add up the indices 
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++){
			double number = numbers[i];
			sum += number;
		}

		double average = sum / numbers.length;
		return average;
	}

	//Calculates the median of the numbers in the array.
	public double calculateMedian() {

		if (numbers.length == 0) {
			operationOnEmptyArrayException();
		}
		double median = 0.0;

		double[] sortedNumbers = numbers.clone(); //Clone is a pretty cool function
		Arrays.sort(sortedNumbers);
		
		int middleIndex = sortedNumbers.length / 2;

		if (sortedNumbers.length % 2 == 0){
			//Even array here
			//Add up the middle index, and +1 the middle index
			median = (sortedNumbers[middleIndex] + sortedNumbers[middleIndex + 1]) / 2.0;
		}
		else{
			median = sortedNumbers[middleIndex];
		}

		return median;
	}


	// Setter: Updates the array with a new set of integers.
	public void updateArray(int[] newNumbers) {
		if (newNumbers == null || newNumbers.length == 0) {
			operationOnEmptyArrayException();
		}

		numbers = new double[newNumbers.length];
		for (int i = 0; i < newNumbers.length; i++) {
			numbers[i] = newNumbers[i];
		}
	}

	// Getter: Retrieves a copy of the current array.
	public double[] accessArray() {
		return numbers.clone();
	}
}
