import java.util.Scanner;

public class Myproject {

	public static void main(String[] args) 
	{
		//create a scanner object to read input from the user
		Scanner input = new Scanner (System.in);
		//prompt the user to input first number
		System.out.print("Input the first number:");
		
		//read and store the first number
		int firstNumber=input.nextInt();
		
		//prompt the user to input the second number
		System.out.print("Input the second number:");
		//read and store the second number
		int secondNumber=input.nextInt();
		//calculate the sum of the two numbers
	
		 int sum = calculateSum(firstNumber, secondNumber);
		//display the sum of the two numbers
		System.out.println("The sum of" + firstNumber + "and" + secondNumber +"is"	+ sum);
				
	}

	public static int calculateSum(int a, int b) {

		return a+b ;
	}

}
