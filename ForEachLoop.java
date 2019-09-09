package basicjava;

public class ForEachLoop {
    
    public static void main(String[] args) {
        
        int[] num = {10, 12, 14,16};
        int sum = 0;
        
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("sum is : "+sum);
    }
}
