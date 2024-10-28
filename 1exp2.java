// Aim: Write a program to print following pattern using looping
// Name: Adyan Shaikh
// UIN : 231P063

package SKL_Java_B2_package;
import java.util.*;
public class patternprinting {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the triangle: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}

			System.out.print("\n");
		}
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");

	}

}