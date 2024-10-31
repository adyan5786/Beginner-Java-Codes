// Aim: Write an object oriented program to make a class called as circle. It should have three methods namely: accept radius, calculate area and display area.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_3; 
import java.util.Scanner;

public class CircleMethods { 
	
	double radius; 
	double area; 
	
	void acceptRadius() 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the radius of the circle: "); 
		radius =sc.nextDouble(); 
	} 
	
	void calculateArea() 
	{
		area = Math.PI * Math.pow(radius, 2);
	}
	
	void displayArea() 
	{ 
		System.out.printf("The area of the circle is %.2f%n", area);
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	} 
	
	public static void main(String[] args)
	{ 
		CircleMethods circle = new CircleMethods();
		circle.acceptRadius();
		circle.calculateArea();
		circle.displayArea(); 
	}
}