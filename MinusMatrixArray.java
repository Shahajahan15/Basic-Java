package basicjava;

import java.util.Scanner;

public class MinusMatrixArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        // geting a input A matrix
        System.out.println("Enter elements for A Matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] : ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("\nEnter elements for B Matrix : ");
        // geting a input B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] : ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        // print A Matrix
        System.out.print("\nA:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println("");
        }

        // print B Matrix
        System.out.print("\nB:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
            }
            System.out.println("");
        }

        // print A - B Matrix
        System.out.print("\nA + B:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] - B[row][col];
                System.out.print("\t" + C[row][col]);
            }
            System.out.println("");
        }

        // print A - B Matrix
        System.out.print("\nA * B:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] * B[row][col];
                System.out.print("\t" + C[row][col]);
            }
            System.out.println("");
        }
    }
}
