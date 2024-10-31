// Aim: Write a program in java to perform the sum of the Diagonal elements of the Matrix. 
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_5;
import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }

        System.out.println("The Entered Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println(" ");
        }

        System.out.println(" ");
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }

        // Output the results
        System.out.println("Sum of the diagonal elements is: " + primaryDiagonalSum);
        System.out.println("Sum of the other diagonal elements is: " + secondaryDiagonalSum);
        System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
    }
}