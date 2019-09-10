
package basicjava;

import java.util.ArrayList;

public class ArrayListThree {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
//        System.out.println("Number 1 : "+number1); // Or
        System.out.print("Number 1 : ");
        for (Integer x : number1) {
            System.out.print(x+" ");
        }
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
//        System.out.println("\nNumber 2 : "+number2);
        System.out.println("");
        System.out.print("Number 2 : ");
        for (Integer x : number2) {
            System.out.print(x+"  ");
        }
        
        System.out.println("");
        number3.addAll(number1);
        System.out.print("Number 3 : ");
        for (Integer x : number3) {
            System.out.print(x+" ");
        }
        
        System.out.println("");
        boolean result = number1.equals(number2);
        System.out.print("Number 1 == Number 2 : "+result);
        
        System.out.println("");
        result = number1.equals(number3);
        System.out.print("Number 1 == Number 3 : "+result);
        
        
        System.out.println("");
    }
    
}
