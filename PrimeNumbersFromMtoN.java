package basicjava;

import java.util.Scanner;

public class PrimeNumbersFromMtoN {
    
    public static void main(String[] args) {
        
        int m, n, count = 0, totalP = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter ending Number : ");
        n = input.nextInt();
        System.out.println("");
        
        if (m<n) 
        {
            for (int i = m; i < n; i++) 
            {
                for (int j = 2; j <= i-1; j++) 
                {
                    if (i%j == 0) 
                    {
                        count++;
                        break;
                    }
                }
                
                if (count == 0) 
                {
                    System.out.println("Prime Number : "+i); 
                    totalP++;
                } 
                count = 0;
            }
        }
        else
        {
            for (int i = n; i < m; i++) 
            {
                for (int j = 2; j <= i-1; j++) 
                {
                    if (i%j == 0) 
                    {
                        count++;
                        break;
                    }
                }
                
                if (count == 0) 
                {
                    System.out.println("Prime Number : "+i); 
                    totalP++;
                }
                count = 0;
            }
        }
        System.out.println("\nTotal prime Number : "+totalP);
    }   
}


