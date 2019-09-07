package basicjava;

import java.util.Scanner;

public class SummationMtoN {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   
//        int sum = 0;                              // 1 to 10 summation
//        for (int i = 0; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("summation : " + sum + "\n");
        
        int m, n, result = 0;
        System.out.print("Enter first number : ");
        m = input.nextInt();
        System.out.print("Enter second number : ");
        n = input.nextInt();
        if (m < n) 
        {
            for (int i = m; i <= n; i++) 
            {
                result = result + i;
            }
            System.out.println("summation : " + result);
        }
        else
        {
            for (int i = n; i <= m; i++) {
            result = result + i;
        }
        System.out.println("summation : " + result);
        }
    }
}
