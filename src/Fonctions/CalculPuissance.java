package Fonctions;

public class CalculPuissance {
    public static void main(String[] args){
        System.out.println(Puissance(2, 4));
    }

    public static int Puissance( double a, double b){
        return (int) Math.pow(a, b);
    }
}
