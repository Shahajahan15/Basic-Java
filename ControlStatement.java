package basicjava;

import java.util.Scanner;

public class ControlStatement {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the any Integer Number : ");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("the number is Positive");
        }
        else if (num < 0) 
        {
            System.out.println("the number is Nagetive");
        }
        else
        {
            System.out.println("Equal to Zero");
        }
    }
}
