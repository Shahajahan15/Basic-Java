package basicjava;

public class StringMethodOne {
    
    public static void main(String[] args) {
        
        String s1 = "Md Shahajahan Ali";
        String s2 = "md Shahajahan Ali";
        
        System.out.println("s1 : "+s1);
        System.out.println("s1 : "+s2);
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        System.out.println("s1 length : "+len1);
        System.out.println("s2 length : "+len2);
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        }
        else    
        {
            System.out.println("not equals");
        }
        
        boolean con = s1.contains(s2);
        System.out.println(con); 
        con = s1.contains("Shahajahan");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("b : "+b);
        
        s1 = "";
        b = s1.isEmpty();
        System.out.println("b : "+b);
    }
    
}
