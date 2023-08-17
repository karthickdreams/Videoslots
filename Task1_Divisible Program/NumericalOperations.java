package Demo;

public class NumericalOperations 
{
	
	// Description: Function to read the array and count the number of elements (integers) divisible by any given number
	// Parameters:
	// Input: arrInputNumbers - [Array] - List of numbers
	// Input : intDivideByNumber - [Integer] - Number to be used for divide by
	// Output : intDivisibleCount - [Integer] - returns the number of elements divisible by intDivideByNumber
	
	public static int countOfDivisible(int[] arrInputNumbers ,int intDivideByNumber) 
	{
		
		int intDivisibleCount = 0;

		for (int intCurrentIterationNumber : arrInputNumbers) {
			if (intCurrentIterationNumber % intDivideByNumber == 0) {
				intDivisibleCount++;
			}
		}
		
		return intDivisibleCount;
	}
	
	// Description: Function to read the array and count the number of elements (integers) divisible by any given two numbers
	// Parameters:
	// Input: arrInputNumbers - [Array] - List of numbers
	// Input : intDivideByNumberOne - [Integer] - First Number to be used for divide by
	// Input : intDivideByNumberTwo - [Integer] - Second Number to be used for divide by
	// Output : intDivisibleCount - [Integer] - returns the number of elements divisible by intDivideByNumber

	public static int countOfDivisibleByTwoNumbers(int[] arrInputNumbers ,int intDivideByNumberOne, int intDivideByNumberTwo)
	{
		int intDivisibleCount=0;
		
		for (int intCurrentIterationNumber : arrInputNumbers) {
			
			if(intCurrentIterationNumber % intDivideByNumberOne ==0 || intCurrentIterationNumber % intDivideByNumberOne==0)
			{
				intDivisibleCount++;
			}
			
		}
		
		return intDivisibleCount;		
	}
}

