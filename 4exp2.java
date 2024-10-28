// Aim: Write a program in java to display number between 1 to 5 and break when it reached to 5.
// Name: Adyan Shaikh
// UIN : 231P063

package SKL_Java_B2_package;
import java.util.*;
public class breakmoment {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Enter the last number for the for loop: ");
		n = sc.nextInt();	
		for (int i  = 1; i <= n; i++)
		{
			if (i == 5)
				break;
			System.out.println(i);
		}
		System.out.println("Out of the for loop now.");
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");

	}

}