package basicjava;

public class StringAndPrimitiveDataType {
    
    public static void main(String[] args) {
        
        // primitive  ->  String
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s : "+i);
        
        
        //  String  ->  primitive
        String S = "30";
        int I = Integer.parseInt(S);
        System.out.println("I : "+I);
        double d = Double.parseDouble(S);
        System.out.println("d : "+d);
        // Or to any 
        int any = Integer.valueOf(S);
        System.out.println("any : "+any);
        
        
    }
    
}
