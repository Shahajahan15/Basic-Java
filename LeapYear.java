package basicjava;

import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int num = input.nextInt();
        if (num % 400 == 0) 
        {
            System.out.println("Leap Year");
        }
        else if (num % 4 == 0 && num % 100 != 0)
            {
                System.out.println("Leap Year");
            }
        else
        {
            System.out.println("No Leap Year");
        }
    }
}


