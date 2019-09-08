package basicjava;

import java.util.Scanner;

public class PatternOne {
    
    public static void main(String[] args) {
        
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter line numbers : ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) 
        {
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
        
        System.out.print("\nEnter line numbers : ");
        n = input.nextInt();
        
        for (int row = n; row >= 1; row--) 
        {
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
        
    }
    
}
