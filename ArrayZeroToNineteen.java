package basicjava;

import java.util.Scanner;

public class ArrayZeroToNineteen {

    public static void main(String[] args) {

        int[][] A = new int[4][5];
        int k = 0;

        // assigning the value to the 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A[row][col] = k;
                k++;
            }
        }

        // printing the elements
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println("");
        }
         System.out.println("");
    }
}
