package Boucles;

import io.Console;

import java.util.Random;

public class NombreMystere {
    public static void main(String[] args){
        Random random = new Random();
        int nombreMystere = random.nextInt(100);
        int nombreEssais = 0;
        int proposition = 0;
        boolean trouver = false;
        System.out.println("Bienvenue au jeu du Nombre Mystère !");
        System.out.println("Je pense à un nombre entre 1 et 100. À vous de le deviner !");

        while(!trouver){
            proposition = Console.lireInt("Entrez votre proposition : ");
            nombreEssais++;
            if(proposition < nombreMystere){
                System.out.println("c'est plus");
            } else if (proposition > nombreMystere){
                System.out.println("c'est moins");
            } else {
                trouver = true;
                System.out.println("félicitation vous avez trouver le numéro");
            }
        }
    }
}
