package basicjava;

import java.util.Scanner;

public class DiagonalUpperLowerTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonal = 0;
        int SumOfUpperElement = 0;
        int SumOfLowerElement = 0;

        // geting a input A matrix
        System.out.println("Enter elements for A Matrix : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] : ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        // print A Matrix
        System.out.print("\nA:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println("");
        }

        // diagonal, upper, lower 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    SumOfDiagonal = SumOfDiagonal + A[row][col];
                }
                
                if (row < col) {
                    SumOfUpperElement = SumOfUpperElement + A[row][col];
                }
                
                if (row > col) {
                    SumOfLowerElement = SumOfLowerElement + A[row][col];
                }
            }
        }
        System.out.println("\nSum of Diagonal : " + SumOfDiagonal);
        System.out.println("\nSum of Upper triangle : " + SumOfUpperElement);
        System.out.println("\nSum of Lower triangle : " + SumOfLowerElement);
    }
}
