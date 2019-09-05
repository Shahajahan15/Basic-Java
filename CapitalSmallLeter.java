package basicjava;

import java.util.Scanner;

public class CapitalSmallLeter {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter the Character : ");
        ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') 
        {
            System.out.println("Capital Character");
        }
        else if (ch >= 'a' && ch <= 'z')
            {
                System.out.println("Small Character");
            }
        else
        {
            System.out.println("Invalid Character");
        }
    }
}



