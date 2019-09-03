package basicjava;

import java.util.Scanner;

/**
 * @author Shahajahan
 */
public class ArithmeticDemo {
    public static void main(String[] arge) {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum : "+result);
        
        result = num1 - num2;
        System.out.println("Sub : "+result);
        
        result = num1 * num2;
        System.out.println("Multipolication : "+result);
        
        double result2 = (double)num1 / num2;
        System.out.println("Devide : "+result2);
        
        result = num1 % num2;
        System.out.println("Remainder : "+result);
    }
}
