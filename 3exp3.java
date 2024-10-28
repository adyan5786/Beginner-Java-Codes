// Aim: Write an object oriented program in java that uses Euclid’s algorithm to display Greatest common divisor of two integer.
// Name: Adyan Shaikh
// UIN: 231P063


package MainMain; 
import java.util.Scanner; 

public class Euclid { 
	
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
		Euclid gcdCalculator = new Euclid(); 
		gcdCalculator.acceptNumbers();
		gcdCalculator.calculateGCD(); 
		gcdCalculator.displayGCD(); 
	}
}
Euclid.java
Displaying Euclid.java.
Experiment No. 03: Write a program to create a class Account to perform the operation of insert, deposit and withdrawal of single employee and make a use of object.
Prof. MOHD ASHFAQUE
•
Jul 30 (Edited Aug 5)
15 points
B3:30-7-24
B1: 5-8-24
B2: 5-8-24

Exp-03(SKL-OOP (JAVA)) 2021.pdf
PDF
/15
/5
/5
/5
Class comments
