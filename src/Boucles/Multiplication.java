package Boucles;

import io.Console;
public class Multiplication {
    public static void main(String[] args){
        int nombre = Console.lireInt("Entrez un nombre, afin d'afficher sa table");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(nombre + " X " + i + " = " + (nombre *i));
        }
    }
}
