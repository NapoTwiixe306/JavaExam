package TrainingExamJanvier2025;

import io.Console;

public class Calculatrice {
    public static void main(String[] args){
        do {
            int a = Console.lireInt("Entrez votre premier nombre : ");
            int b = Console.lireInt("Entrez votre deuxième nombre : ");
            int resultat = addition(a, b);
            System.out.println("Le résultat de l'addition est : " + resultat);

        } while (Console.lireChar("Voulez-vous faire un autre calcul ? (o/n) : ") == 'o');
    }

    public static int addition(int a, int b){
        return a + b;
    }
}
