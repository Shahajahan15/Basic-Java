package basicjava;

import java.util.Scanner;

public class LetterGrade {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int mark;
        System.out.print("Enter the Number : ");
        mark = input.nextInt();
        if (mark >= 100 || mark <= 0) 
        {
            System.out.println("Invalid Number");
        }
        else if (mark >= 80 && mark <= 100 ) 
        {
            System.out.println("Gade : A+");
        }
        else if (mark >= 70 && mark <= 79 ) 
        {
            System.out.println("Gade : A");
        }
        else if (mark >= 60 && mark <= 69 ) 
        {
            System.out.println("Gade : A-");
        }
        else if (mark >= 50 && mark <= 59 ) 
        {
            System.out.println("Gade : B");
        }
        else if (mark >= 40 && mark <= 49 ) 
        {
            System.out.println("Gade : C");
        }
        else if (mark >= 33 && mark <= 39 ) 
        {
            System.out.println("Gade : D");
        }
        else 
        {
            System.out.println("Gade : F");
        }
    }
}



