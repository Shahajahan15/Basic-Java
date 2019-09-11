package basicjava;

public class StringMethodThree {
    
    public static void main(String[] args) {
        
        String country = "Bangladesh is my country.";
        System.out.println(country);
        
        char ch = country.charAt(0); 
        System.out.println(ch);
        
        int value = country.codePointAt(0);
        System.out.println(value); // to print ASCII code number
        
        int pos = country.indexOf("e");
        System.out.println("Position is E : " +pos);
        
        pos = country.lastIndexOf("n");
        System.out.println("last Index Of n : "+pos);
        
        country = "  Bangladesh is my country.  ";
        System.out.println(country);
        String s1 = country.trim();  // trim space
        System.out.println(s1);
        
        
        System.out.println("");
    }
}
