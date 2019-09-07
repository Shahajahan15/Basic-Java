package basicjava;

import java.util.Scanner;

public class SumSeriesNumberTwo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int multi = 1, m, multies=1;
        System.out.print("Enter the number : ");
        m = input.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            multi = multi * i;
        }
        System.out.println("\nMultiplication of N Series Number : " + multi);
        
        
        System.out.print("Enter the number : ");
        m = input.nextInt();
        for (int i = 1; i <= m; i = i+2) {
            System.out.print(i + " ");
            multies = multies * i;
        }
        System.out.println("\nMultiplication of N Series Odd Number : " + multies);
        
        double n, sum=1;
        System.out.print("Enter the number : ");
        n = input.nextInt();        
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum * i;
        }
        System.out.println("\nMultiplication of N Series Number : " + sum);
        
        
        int s, sums=1;
        System.out.print("Enter the number : ");
        s = input.nextInt();        
        for (int i = 1; i <= s; i++) {
            System.out.print(i + " ");
            sums = sums * i*i;
        }
        System.out.println("\nMultiplication of N Series Number : " + sums);
    }
}
