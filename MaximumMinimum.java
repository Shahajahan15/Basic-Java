package basicjava;

import java.util.Scanner;

public class MaximumMinimum {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first Integer number : ");
        num1 = input.nextInt();
        System.out.print("Enter second Integer number : ");
        num2 = input.nextInt();
        if (num1 > num2) 
        {
            System.out.println("Maximum Number");
        }
        else if (num1 < num2) 
        {
            System.out.println("Minimum Number");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
