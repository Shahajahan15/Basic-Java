package basicjava;
import java.util.Scanner;
public class TriangleOperation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter the base : ");
        base = input.nextDouble();
        System.out.print("Enter the height : ");
        height = input.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Triangle of area : "+ area);
    }
}
