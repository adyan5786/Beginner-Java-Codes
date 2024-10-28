// Aim: Write a program in java to display triangle of numbers
// Name: Adyan Shaikh
// UIN : 231P063

package SKL_Java_B2_package;
import java.util.*;
public class patternprinting3 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the triangle: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" " + j + " ");
			}

			System.out.print("\n");
		}
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");

	}

}