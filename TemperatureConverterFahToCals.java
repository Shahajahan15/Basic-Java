package basicjava;

import java.util.Scanner;

public class TemperatureConverterFahToCals {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.print("Enter the type fahrenheit : ");
        fahrenheit = input.nextDouble();
        celsius = ( fahrenheit - 32 ) * 5/9 ;
        System.out.println("Celsius : " + celsius);
    }    
}
