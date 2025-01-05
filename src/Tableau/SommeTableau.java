package Tableau;

public class SommeTableau {
    public static void main(String[] args){
        int[] tableau = {1, 2, 3, 4};
        int somme = 0;
        for (int i : tableau){
            somme = somme + i;
        }
        System.out.println(somme);
    }
}
