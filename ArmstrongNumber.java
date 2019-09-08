package basicjava;

import java.util.Scanner;

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        int sum = 0, r, temp, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number to Armstrong : ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0) 
        {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        
        if (sum == num) 
        {
            System.out.println("A Armstrong Number : "+sum);
        }
        else
        {
            System.out.println("Not A Armstrong Number : "+sum);
        }
        
    }   
}
