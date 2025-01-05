package MiniProjet;

import io.Console;

public class IMC {
    public static void main(String[] args){
        double taille = Console.lireDouble("Quel est votre taille ? ex: 1.80 : ");
        double poids = Console.lireDouble("Quel est votre poids (en Kg) : ");
        double imc = poids / (taille * taille);
        System.out.printf("Votre IMC est : %.2f%n", imc);

        if(imc < 18.5){
            System.out.println("Insuffisance pondérale");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Poids normal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Surpoids");
        } else {
            System.out.println("Obésité");
        }
    }
}
