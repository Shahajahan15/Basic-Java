package basicjava;

import java.util.Scanner;

public class SumEvenOddNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int m, n, result = 0;
        System.out.print("Enter first number : ");
        m = input.nextInt();
        System.out.print("Enter second number : ");
        n = input.nextInt();
        if (m < n) 
        {
            for (int i = m; i <= n; i++) 
            {
                if (i%2==0) 
                {
                    System.out.print(" "+i);
                    result = result + i;
                }
            }
            System.out.println("\nsummation of all Even Number : " + result + "\n");
        }
        else
        {
            for (int i = n; i <= m; i++) 
            {
                if (i %  2 == 0) 
                {
                    System.out.print(i+" ");
                    result = result + i; 
                }
            }
            System.out.println("\nsummation of all Even Number : " + result + "\n");
        }
        
        int s, a, odd_sum = 0;
        System.out.print("Enter first number : ");
        s = input.nextInt();
        System.out.print("Enter second number : ");
        a = input.nextInt();
        
        if (s < a) 
        {
            for (int i = s; i <= a; i++) 
            {
                if (i%2 != 0) 
                {
                    System.out.print(" "+i);
                    odd_sum = odd_sum + i;
                }
            }
            System.out.println("\nsummation of all Odd Number : " + odd_sum);
        }
        else
        {
            for (int i = a; i <= s; i++) 
            {
                if (i %  2 != 0) 
                {
                    System.out.print(i+" ");
                    odd_sum = odd_sum + i; 
                }
            }
            System.out.println("\nsummation of all Odd Number : " + odd_sum);
        }
    }
}
