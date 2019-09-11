package basicjava;

import java.util.Scanner;

public class BinaryOctalHexadecimalToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  Binary  to Decimal
        System.out.print("Enter any Binary number : ");
        String Binary = input.nextLine();
        Integer Decimal = Integer.parseInt(Binary, 2);
        System.out.println("Binary to Decimal : " + Decimal);

        //  Octal  to Decimal
        System.out.print("Enter any Octal number : ");
        String Octal = input.nextLine();
        Decimal = Integer.parseInt(Octal, 8);
        System.out.println("Octal to Decimal : " + Decimal);

        //  Hexadecimal  to Decimal
        System.out.print("Enter any Hexadecimal number : ");
        String Hexadecimal = input.nextLine();
        Decimal = Integer.parseInt(Hexadecimal, 16);
        System.out.println("Hexadecimal to Decimal : " + Decimal);
    }
}
