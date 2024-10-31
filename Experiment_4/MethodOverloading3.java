// Aim:  Write a program to add integer number and string using method overloading.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_4;
public class MethodOverloading3 {
	public static void main(String[] args) {
		StrInt obj = new StrInt();
		int sum = obj.add(5, 10);
		System.out.println("Sum of integers: " + sum); 
		String concatenatedString = obj.add("Hello ", "World");
		System.out.println("Concatenated String: " + concatenatedString);
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	}
}

class StrInt
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
		
	public String add(String a, String b) 
	{
		return a + b;
	}
}
