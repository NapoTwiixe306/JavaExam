package TestPasUnitaire;

import io.Console;

public class Exam23Janvier {

    public static void main(String[] args) {

        int nbMinJoueurs = Console.lireInt("Nombre minimum de joueurs ?");

        int nbMaxJoueurs = Console.lireInt("Nombre maximum de joueurs ? ");

        int nbConfigurations = nbMaxJoueurs - nbMinJoueurs + 1;

        String[] appreciations = {"Meilleur", "Recommandé", "Pas recommandé"};
        int[][] votes = new int[nbConfigurations][3];

        boolean quitter = false;

        while (!quitter) {
            System.out.println("\nMENU :");
            System.out.println("1. Voter");
            System.out.println("2. Consulter les résultats");
            System.out.println("3. Quitter");
            System.out.print("Choix ? ");

            int choix = Console.lireInt();

            switch (choix) {
                case 1 -> voter(nbMinJoueurs, votes);
                case 2 -> afficherTableauRecapitulatif(appreciations, votes, nbMinJoueurs);
                case 3 -> quitter = true;
                default -> System.out.println("Option invalide.");
            }
        }

        System.out.println("Fin du programme.");
    }

    public static void voter(int nbMinJoueurs, int[][] votes) {
        System.out.println("Votre appréciation ...");
        System.out.println("(M)eilleur");
        System.out.println("(R)ecommandé");
        System.out.println("(P)as recommandé");
        System.out.println("(N)SP");

        for (int i = 0; i < votes.length; i++) {
            System.out.print("... pour " + (nbMinJoueurs + i) + " joueur(s) ? ");
            char choix = lireCaractere("MRPN");

            switch (choix) {
                case 'M' -> votes[i][0]++;
                case 'R' -> votes[i][1]++;
                case 'P' -> votes[i][2]++;
                case 'N' -> {}
            }
        }
    }

    public static char lireCaractere(String admis) {
        while (true) {
            String input = Console.lireString().trim().toUpperCase();
            if (input.length() == 1 && admis.contains(input)) {
                return input.charAt(0);
            }
            System.out.print("Veuillez entrer un caractère valide : ");
        }
    }

    public static void afficherTableauRecapitulatif(String[] appreciations, int[][] votes, int nbMinJoueurs) {
        System.out.printf("%-12s", "# joueurs");
        for (String appreciation : appreciations) {
            System.out.printf("%-15s", appreciation);
        }
        System.out.println("# votes");

        for (int i = 0; i < votes.length; i++) {
            int totalVotes = sommer(votes[i]);
            System.out.printf("%-12d", nbMinJoueurs + i);

            for (int j = 0; j < votes[i].length; j++) {
                if (totalVotes > 0) {
                    double taux = (votes[i][j] * 100.0) / totalVotes;
                    System.out.printf("%-10.1f%% (%d)", taux, votes[i][j]);
                } else {
                    System.out.printf("%-15s", "- (0)");
                }
            }
            System.out.printf("%-10d\n", totalVotes);
        }
    }

    public static int sommer(int[] t) {
        int somme = 0;
        for (int value : t) {
            somme += value;
        }
        return somme;
    }
}
