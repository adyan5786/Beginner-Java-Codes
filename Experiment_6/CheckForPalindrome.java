// Aim: Write a program in java to check string is palindrome or not using string buffer object
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_6;
import java.util.*;
public class CheckForPalindrome {
	public static void main(String[] args) {

		String str, rev;
		StringBuffer str1 = new StringBuffer();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = sc.nextLine();

		str1.append(str);
		str1.reverse();
		rev = str1.toString();
		if (str.equalsIgnoreCase(rev))
			System.out.println("Given String is a Palindrome.");
		else
			System.out.println("Given String is not a Palindrome.");
		System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
	}
}