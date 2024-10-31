// Aim: Write a program in java to count vowels of a given string.  
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_5;
import java.util.Scanner;
public class CountinVowels {
	public static void main(String[] args) {
		String str = new String();
		char ch[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int len, count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence : ");
		str = sc.nextLine();

		System.out.println("The entered string is : " + str);

		len = str.length();
		for (int i = 0; i <= len - 1; i++) {
			for (int j = 0; j <= 9; j++)

				if (ch[j] == str.charAt(i))
					count++;
		}
		System.out.println("Frequency of the vowels in the given string is : " + count);
		sc.close();
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	}
}