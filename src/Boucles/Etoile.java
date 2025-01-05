package Boucles;

public class Etoile {
    public static void main(String[] args) {
        int etoile = 5;

        for (int i = 1; i <= etoile; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
