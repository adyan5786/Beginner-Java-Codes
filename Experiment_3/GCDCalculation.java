// Aim: Write an object oriented program in java that uses Euclid’s algorithm to display Greatest common divisor of two integer.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_3; 
import java.util.Scanner; 
public class GCDCalculation { 
	
	int num1; 
	int num2;
	int gcd;
	
	public void acceptNumbers() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = scanner.nextInt();
		System.out.print("Enterthe second number: ");
		num2 = scanner.nextInt();
	} 
 
	public void calculateGCD()
	{ 
		int temp; while
			(num2 != 0) 
		{ 
			temp = num2; 
			num2 = num1 % num2; 
			num1 = temp; 
		}
		gcd = num1; 
	}
	
	public void displayGCD() 
	{
		System.out.println("The GCD of the two numbers is: " + gcd); 
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	} 
	
	public static void main(String[] args) 
	{
		GCDCalculation gcdCalculator = new GCDCalculation(); 
		gcdCalculator.acceptNumbers();
		gcdCalculator.calculateGCD(); 
		gcdCalculator.displayGCD(); 
	}
}

