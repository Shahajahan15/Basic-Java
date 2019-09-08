package basicjava;

import java.util.Scanner;

public class SumofDigits {
    
    public static void main(String[] args) {
        
        int sum = 0, r, temp, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0) 
        {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }   
}
