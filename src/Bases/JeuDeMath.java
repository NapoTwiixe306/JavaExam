package Bases;

import io.Console;

public class JeuDeMath {
    public static void main(String[] args){
        int nombre = Console.lireInt("choisis un nombre pour le carré : ");
        int res = carre(nombre);
        System.out.println("le resultat de " + nombre + " au carré est : " + res);
    }
    public static int carre(double a){
        return (int) Math.pow(a, 2);
    }
}
