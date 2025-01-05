package TrainingExamJanvier2025;

import io.Console;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        boolean continuer = true;

        while (continuer) {
            System.out.println("Bienvenue dans le convertisseur Celsius ↔ Fahrenheit.");
            System.out.println("1. Convertir de Celsius vers Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit vers Celsius");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option (1, 2 ou 3) : ");
            int choix = Console.lireInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    double celsius = Console.lireDouble();
                    System.out.println(celsius + " °C correspond à " + celsiusToFahrenheit(celsius) + " °F");
                    break;
                case 2:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double fahrenheit = Console.lireDouble();
                    System.out.println(fahrenheit + " °F correspond à " + fahrenheitToCelsius(fahrenheit) + " °C");
                    break;
                case 3:
                    System.out.println("Merci d'avoir utilisé le convertisseur !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
