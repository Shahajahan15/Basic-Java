package basicjava;

import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        // geting a input A matrix
        System.out.println("Enter elements for A Matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] : ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        // print A Matrix
        System.out.println("\nA Matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + "  ");
            }
            System.out.println("");
        }

        System.out.println("\nEnter elements for B Matrix : ");
        // geting a input B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] : ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        // print B Matrix
        System.out.println("\nB Matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(B[row][col] + "  ");
            }
            System.out.println("  ");
        }
    }
}
