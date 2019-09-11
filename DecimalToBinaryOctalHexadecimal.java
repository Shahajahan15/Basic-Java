package basicjava;

import java.util.Scanner;

public class DecimalToBinaryOctalHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Decimal number : ");
        int Decimal = input.nextInt();

        // Decimal to Binary
        String binary = Integer.toBinaryString(Decimal);
        System.out.println("Binary : " + binary);

        //  // Decimal to Octal
        String Octal = Integer.toOctalString(Decimal);
        System.out.println("Octal : " + Octal);

        //  // Decimal to Hexadecimal
        String Hexadecimal = Integer.toHexString(Decimal);
        System.out.println("Hexadecimal : " + Hexadecimal);
    }
}
