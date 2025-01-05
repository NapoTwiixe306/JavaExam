package MiniProjet;

import io.Console;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args){
        System.out.print("Quelle longueur voulez-vous pour le mot de passe ? ");
        int length = Console.lireInt("Quelle longueur voulez-vous pour le mot de passe ? ");

        if (length <= 0) {
            System.out.println("La longueur doit être supérieure à 0 !");
            return;
        }

        String password = generatePassword(length);
        System.out.println("Votre mot de passe généré est : " + password);
    }

    public static String generatePassword(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{};:,.<>?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
