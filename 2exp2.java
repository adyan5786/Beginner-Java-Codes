// Aim: Write a program to print following pattern using branching
// Name: Adyan Shaikh
// UIN : 231P063

package SKL_Java_B2_package;
import java.util.*;
public class patternprinting2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the triangle: ");
		n = sc.nextInt();
		out: {
			in: for (int i = 1; i <= 100; i++)
			{
				if (i==(n+1))
					break out;
				for (int j = 1; j <= 100; j++)
				{	
					if (i < j)
					{
						System.out.print("\n");
						continue in;
					}
					System.out.print(" * ");
				}
				
			}
		}
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	}

}