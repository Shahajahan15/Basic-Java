package basicjava;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int sum = 0, r, temp, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number to Palindrome : ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0) 
        {
            r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;
        }
        
        if (sum == num) 
        {
            System.out.println("Palindrome Number : "+sum);
        }
        else
        {
            System.out.println("Not Palindrome Number : "+sum);
        }
        
    }   
}
