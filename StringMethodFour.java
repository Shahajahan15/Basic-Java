package basicjava;

public class StringMethodFour {

    public static void main(String[] args) {

        String s1 = "This is my country.";
        System.out.println(s1);
        
        String s2 = s1.replace("i", "j"); // replace the char
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");  // removve the spase
        for (String x : s3) {
            System.out.print(x );
        }
        System.out.println("");
        
        StringBuffer sb = new StringBuffer("This is ");   // append
        sb.append("my");
        sb.append(" country.");
        System.out.println(sb);
        
        sb.setLength(12);   // Length set
        System.out.println("Set Length : "+sb);     
        
        sb.reverse();              // reverse
        System.out.println(sb);
        
        StringBuilder sd = new StringBuilder("This is my country.");
        sd.delete(1, 7);    
        System.out.println(sd);   // delete
        
        System.out.println("");
    }
}
