// Aim: Write a program in java to perform (ii) Count frequency of a given letter in a String.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_5;
import java.util.Scanner;
public class CountingLetters {
	public static void main(String[] args) {

		String str = new String();
		char ch;
		int len, count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence : ");
		str = sc.nextLine();

		System.out.print("Enter a character to be searched in the string : ");
		ch = sc.next().charAt(0);
		System.out.println("The entered string is : " + str);

		len = str.length();
		for (int i = 0; i <= len - 1; i++) {
			if (ch == str.charAt(i))
				count++;
		}
		System.out.println("Frequency of the character '" + ch + "' in the string is : " + count);
		sc.close();

		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	}
}