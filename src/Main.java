public class Main {
    public static void main(String[] args) {
        /*initialiser un tableau de nombre et l'afficher*/
        System.out.println("initialiser et afficher un tableau");
        int[] tableau = { 1, 20, 9, 17, 15 };
        for(int i = 0; i < tableau.length; i++ ) {
            System.out.println(tableau[i]);
        }
        System.out.println("-----------------");


        /*Changer élément d'un tableau*/
        System.out.println("changer élément d'un tableau");
        String[] name = {"pierre", "arthur", "jean"};
        name[1] = "mich";
        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("-----------------");


        /*Somme des éléments d'un tableau*/
        System.out.println("Somme des éléments");
        int[] tab = {1, 2, 3, 4, 5};
        int somme = 0;
        for( int i : tab) {
            somme = somme + i;
        }
        System.out.println("La somme des éléments du tableau est : "+ somme);
    }
}