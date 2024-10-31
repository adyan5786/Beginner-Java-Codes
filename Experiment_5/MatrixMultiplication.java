// Aim: Write a program in java to perform Matrix Multiplication. 
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_5;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in matrix A:");
        int rowsInA = scanner.nextInt();

        System.out.println("Enter the number of columns in matrix A:");
        int colsInA = scanner.nextInt();

        System.out.println("Enter the number of rows in matrix B:");
        int rowsInB = scanner.nextInt();

        System.out.println("Enter the number of columns in matrix B:");
        int colsInB = scanner.nextInt();

        if (colsInA != rowsInB) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        int[][] matrixA = new int[rowsInA][colsInA];
        int[][] matrixB = new int[rowsInB][colsInB];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < colsInA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rowsInB; i++) {
            for (int j = 0; j < colsInB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Result Matrix:");
        printMatrix(result);

        scanner.close();
        System.out.println("Name: Adyan Shaikh \nUIN: 231P063 \nBranch: Comps A");
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsInA = matrixA.length;
        int colsInA = matrixA[0].length;
        int rowsInB = matrixB.length;
        int colsInB = matrixB[0].length;

        int[][] result = new int[rowsInA][colsInB];

        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < colsInB; j++) {
                for (int k = 0; k < colsInA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}