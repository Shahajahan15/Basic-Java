
package basicjava;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number.add(12);
        number.add(-5);
        number.add(10);
        number.add(20);
        number.add(15);
        number.add(5);
        
        System.out.println("Before Sorting an array : "+number);
        
        Collections.sort(number);
        System.out.println("After Sorting an array : "+number);
        
        
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Sorting an array Descending: "+number);
        
        System.out.println("");
    }
    
}
