package basicjava;

public class BreakContinue {
    
    public static void main(String[] args) {
        
         for (int i = 0; i <= 100; i++) {
             if (i == 10) 
             {
                break; 
             }
             System.out.println(i);
        }
         
         System.out.println("\n");
         
         for (int i = 0; i <= 30; i++) {
             if (i == 20) 
             {
                 continue;
             }
             System.out.println(i);
        }
    }
}
