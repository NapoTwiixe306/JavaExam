package Bases;

import io.Console;

public class SimpleCalcul {
    public static void main(String[] args){
        /*on demande a l'utilisateur de choisiri 2 chifres/nombres entier*/
        int a = Console.lireInt("Entrez un premier nombre : ");
        int b = Console.lireInt("Entrez un deuxième nombre : ");

        System.out.println("la réponse de l'addition est : " + addition(a, b) );
        System.out.println("la réponse de la soustraction est : " + soustraction(a, b) );
        System.out.println("la réponse de l'addition est : " + multiplication(a, b) );
    }


    public static int addition(int a, int b){
        return a + b;
    }
    public static int soustraction(int a, int b){
        return a - b;
    }

    public static int multiplication (int a, int b){
        return a * b;
    }
}