package MiniProjet;

import io.Console;

public class GestionMoyenne {
    public static void main(String[] args) {
        int nombreDeNotes = 5;
        double sommeDesNotes = 0;
        int compteur = 0;

        while (compteur < nombreDeNotes) {
            double note = Console.lireDouble("Entrez une note entre 0 et 20 : ");
            if (note >= 0 && note <= 20) {
                sommeDesNotes += note;
                compteur++;
            } else {
                System.out.println("Note invalide, veuillez entrer une note entre 0 et 20.");
            }
        }

        double moyenne = sommeDesNotes / nombreDeNotes;
        System.out.println("La moyenne de l'élève est : " + moyenne);

        if (moyenne >= 16) {
            System.out.println("Appréciation : Excellent");
        } else if (moyenne >= 12) {
            System.out.println("Appréciation : Bien");
        } else if (moyenne >= 8) {
            System.out.println("Appréciation : Passable");
        } else {
            System.out.println("Appréciation : Insuffisant");
        }
    }
}
