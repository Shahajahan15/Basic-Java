/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author Shahajahan
 */
public class InputDemo {
    public static void main(String[] args) {
//        int number input by user
        Scanner input = new Scanner(System.in);
        int number; 
        System.out.print ("Enter the any number : ");
        number = input.nextInt();
        System.out.println("Number :" + number);
//string input by user
        String sname;
        Scanner name = new Scanner(System.in);
        System.out.print ("Enter your name : ");
        sname = name.nextLine();
        System.out.println("Your  Name :" + sname);
//double number input by user
        double doubled;
        Scanner doubles = new Scanner(System.in);
        System.out.print ("Enter the type number : ");
        doubled = doubles.nextDouble();
        System.out.println("the number is : " + doubled);
    
    }
}


