// Aim: Write a program in java to display number between 1 to 10 except 5 using continue statement.
// Name: Adyan Shaikh
// UIN : 231P063

package SKL_Java_B2_package;
import java.util.*;
public class continuemoment {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Enter the last number for the for loop: ");
		n = sc.nextInt();	
		for (int i  = 1; i <= n; i++)
		{
			if (i == 5)
				continue;
			System.out.println(i);
		}
		System.out.println("Out of the for loop now.");
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");

	}

}