package basicjava;

import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double celsius, Fahrenheit;
        System.out.print("Enter the type celsius : ");
        celsius = input.nextDouble();
        Fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit : " + Fahrenheit);
    }
}
