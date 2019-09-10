
package basicjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTwo {
    
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
        
//        number.removeAll(number);
//        System.out.print("After remove all : "+number);
//        number.clear();
//        System.out.print("After clear all : "+number);
        
//         to check boolean by isEmpty()
        boolean check = number.isEmpty();
        System.out.print("\nSize : "+number.size());
        System.out.print("\nAfter Empty : "+check+"\n");
               
        boolean containe = number.contains(40);  // to check value
        System.out.print("40 is in the list : "+containe+"\n");
        
        int pos = number.indexOf(40);
        System.out.println("Indes of 40 is : "+ pos);
        
        number.set(1, 20);
        number.set(2, 30);
        number.set(3, 40);
        System.out.print("After Set array list : ");
        for (int x : number) {
            System.out.print(x+ " ");
        }
        System.out.println("");
        
        
        int n = number.get(3);
        System.out.println("After get : "+n);
        
        
        System.out.println("");
    }
    
}
