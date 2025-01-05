package Tableau;

import io.Console;
public class SearchElement {
    public static void main(String[] args) {
        int n = Console.lireInt("Entrez un nombre à rechercher : ");
        Search(n);
    }

    public static void Search(int n) {
        int[] tableau = {3, 5, 7};
        boolean found = false;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == n) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Existant");
        } else {
            System.out.println("Impossible");
        }
    }
}
