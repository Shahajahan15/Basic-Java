package basicjava;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        
        int x = 25, y;
        
        y = x++;      // post increment  y = 25
        System.out.println("Increment \nY is : "+y);
        y = x;          // y = 26
        System.out.println("Y is : "+y);
        
        y = ++x;        // pre increment  y = 27
        System.out.println("Y is : "+y);
        y = x;                          // y = 27
        System.out.println("Y is : "+y+"\n");
        
        y = x--;        // post decrement  y = 27
        System.out.println("Decrement \nY is : "+y);
        y = x;                      // y = 26
        System.out.println("Y is : "+y);
        
        y = --x;    // pre cecrement  y = 25
        System.out.println("Y is : "+y);
        y = x;                     // y = 25
        System.out.println("Y is : "+y);
        
    }
}
