package basicjava;

import java.util.Scanner;

/**
 * @author Shahajahan
 */
public class CircleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter the radius : ");
        radius = input.nextDouble();
        area = 3.1416*radius*radius;
        System.out.println("Area of Circle : " +area);
    }
}
