package basicjava;

public class WrapperClass {
    
    public static void main(String[] args) {
        
        // primitive  ->  object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("Y : "+y);
        
        Integer z = x;   // Integer.valueOf, so this is autoboxing
        System.out.println("Z : "+z);
        
        
        // Object  ->  primitive
        Double d = new Double(10.12);
        System.out.println("D : "+d);
        
        double e = d.doubleValue();     //d.doubleValue() 
        System.out.println("E : "+e);
        
        double b = d;                  // unboxing  ==  d.doubleValue() same
        System.out.println("B : "+b);
        
    }
    
}
