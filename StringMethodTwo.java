package basicjava;

public class StringMethodTwo {
    
    public static void main(String[] args) {
        
        String firstName = "Shahajahan";
        String lastName = " Ali";
        String fullName, upperName, lowerName;
        
//        fullName = firstName + lastName;
        fullName = firstName.concat(lastName);
        System.out.println("Full Name : "+fullName);
        
        upperName = fullName.toUpperCase();
        System.out.println("Upper Name : "+upperName);
        
        lowerName = fullName.toLowerCase();
        System.out.println("Lower Name : "+lowerName);
        
        boolean b = firstName.startsWith("Shahaj");
        System.out.println("First Name : "+b);
        
        boolean last = lastName.endsWith("Is");
        System.out.println("Last Name : "+last);
        
        String[] name = {"Shahajahan", "ali", "tuhin", "Islam"};
        for (String x : name) {
            System.out.print(x+" ");
        }
        
        System.out.println("");
    }
}
