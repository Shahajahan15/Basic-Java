
package basicjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOne {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size : "+number.size()); // to show array size
        
        // adding  elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50);
        
//        System.out.println(number+" "); // to show array
//        for (int x : number) {
//            System.out.print(x+" ");  // to show array
//        }
        
        Iterator itr = number.iterator();
        System.out.print("Arrary List : ");
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nSize : "+number.size());
        
        
        number.remove(1);
        System.out.print("After remove array list : ");
        for (int x : number) {
            System.out.print(x+ " ");
        }
        System.out.println("\nSize : "+number.size());
        
        
        number.removeAll(number);
        System.out.print("After remove all : "+number);
        System.out.println("\nSize : "+number.size());
    }
    
}
