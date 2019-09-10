package basicjava;

import java.util.Arrays;

public class SortingAnArray {

    public static void main(String[] args) {

        int[] number = {12, 15, -14, 20, 9};
        Arrays.sort(number);

        System.out.print("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println("");
        System.out.print("Descending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }

        String[] name = {"rohim", "korim", "khalek", "malek", "salek"};
        Arrays.sort(name);

        System.out.println("\n");
        System.out.print("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(name[i] + " ");
        }

        System.out.println("");
        System.out.print("Descending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }

        System.out.println("\n");
    }

}
