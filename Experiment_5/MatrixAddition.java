// Aim:  Write a program in java to perform (i) Matrix Addition
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_5;
import java.util.*;
public class MatrixAddition {
	public static void main(String[] args) {
		{
			int i, j;
			int add[][] = new int[3][3];
			int set1[][] = new int[3][3];
			int set2[][] = new int[3][3];
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the first matrix:\n");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					set1[i][j] = input.nextInt();
			}

			System.out.print("Enter the second matrix :\n");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					set2[i][j] = input.nextInt();
			}

			System.out.println("The first matrix is : ");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					System.out.print(set1[i][j] + "\t");

				System.out.println(" ");
			}

			System.out.println("The second matrix is : ");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					System.out.print(set2[i][j] + "\t");
				System.out.println(" ");
			}
			System.out.println(" ");

			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					add[i][j] = set1[i][j] + set2[i][j];
			}

			System.out.println("The addition of both the matrix is :");
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					System.out.print(add[i][j] + "\t");
				System.out.println(" ");
			}

		}
		System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
	}
}