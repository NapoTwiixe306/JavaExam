package Entre_Sorties;

import io.Console;

public class MultiDeuxNombre {
    public static void main(String[] args){
        double a = Console.lireDouble("entrez un premier chiffre ou un nombre : ");
        double b = Console.lireDouble("entrez un deuxième chiffre ou un nombre : ");

        if( a == 0 || b == 0){
            System.out.println("Erreur : la multiplication par zéro donne toujours zéro.");
        } else{
            System.out.println("le resultat de la multiplication est : " + Multiplication(a, b));
        }
    }

    public static double Multiplication(double a, double b){
        return a * b;
    }
}
