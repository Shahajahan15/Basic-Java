package basicjava;

import java.util.Scanner;

public class FactorialNumber {
    
    public static void main(String[] args) {
        
        int n, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive Integer : ");
        n = input.nextInt();
        
        for (int i = n; i >=1; i--) {
            fact = fact*i;
        }
        System.out.println("Factorial of " +n+ " : " +fact);
        
    }
}
