package Tableau;

import java.util.Arrays;

public class TrierTableau {
    public static void main(String[] args){
        int[] Trier = {3, 1, 4, 2};
        Arrays.sort(Trier);

        for (int numbers : Trier){
            System.out.println(numbers);
        }

    }
}
