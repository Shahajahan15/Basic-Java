package basicjava;

public class StringBuilders {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Bangladesh");
        System.out.println("str : " + str);
        
        str.append(" is ");
        str.append("my ");
        str.append("country");
        System.out.println(str);
        
        str.reverse();              // reverse
        System.out.println(str);
        
        StringBuilder sd = new StringBuilder("This is my country.");
        sd.delete(7, 9);    
        System.out.println(sd);   // delete
        
        System.out.println("");

    }

}
