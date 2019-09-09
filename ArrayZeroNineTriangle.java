package basicjava;

import java.util.Scanner;

public class ArrayZeroNineTriangle {

    public static void main(String[] args) {

        int[][] A = new int[4][];
        int k = 0;

        A[0] = new int[1];
        A[1] = new int[2];
        A[2] = new int[3];
        A[3] = new int[4];
        
        // assigning the value to the 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                A[row][col] = k;
                k++;
            }
        }

        // printing the elements
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
