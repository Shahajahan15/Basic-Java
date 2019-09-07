package basicjava;

import java.util.Scanner;

public class SumSeriesNumberOne {
    
    public static void main(String[] args) 
    {
        int n, sum = 0, sums = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\nSum of N Series Number : " + sum);
        
        
        System.out.print("Enter the number : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sums = sums + i;
        }
        System.out.println("\nSum of N Series Odd Number : " + sums);
        
        
        System.out.print("Enter the number : ");
        n = input.nextInt();
        double summ = 0;
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            summ = summ + i;
        }
        System.out.println("\nSum of N Series Number : " + summ);
        
        
        int multi = 1, m;
        System.out.print("Enter the number : ");
        m = input.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            multi = multi + i*i;
        }
        System.out.println("\nMultiplication of N Series Number : " + multi);        
    }  
}
