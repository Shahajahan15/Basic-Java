package basicjava;

import java.util.Random;

public class RandomNumberGenerate {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int randnumber = rand.nextInt(10*4)+5;
        System.out.println(randnumber);
        
        int randnumbers = (int)(Math.random()*10)+2;
        System.out.println(randnumbers);
        
    }
    
}
