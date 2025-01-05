package Fonctions;

public class HeureConvertion {
    public static String convertir(int minutes) {
        int heures = minutes / 60;
        int resteMinutes = minutes % 60;
        return heures + "h" + resteMinutes;
    }

    public static void main(String[] args) {
        int minutes = 130;
        String resultat = convertir(minutes);
        System.out.println( minutes + " minutes = " + resultat);
    }
}
