package basicjava;

public class StringPalindrome {
    
    public static void main(String[] args) {
        
        String s1 = "madam";
        
        StringBuilder sb = new StringBuilder(s1);
        
        String s2 = sb.reverse().toString();
        
        if (s1.equals(s2)) {
            System.out.println(s1+" : Palindrome");
        }
        else 
        {
            System.out.println(s1+" : Not a Palindrome");
        }
    }
    
}
