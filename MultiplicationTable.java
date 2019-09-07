package basicjava;

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.print("Enter Initial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number : ");
        n = input.nextInt();
        
        if (m < n)
        {
            for (int i = m; i <= n; i++) 
            {
                System.out.println("\nMultiplication of : " +i);
                for (int j = 1; j <= 10; j++) 
                {
                    System.out.println(i +" x "+ j +" : "+j*i );
                }
            }
        }
        else
        {
            for (int i = n; i <= m; i++) 
            {
                System.out.println("\nMultiplication of : " +i);
                for (int j = 1; j <= 10; j++) 
                {
                    System.out.println(i +" x "+ j +" : "+j*i );
                }
            }
        }
    }
}
