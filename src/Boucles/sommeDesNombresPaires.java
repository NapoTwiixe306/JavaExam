package Boucles;

public class sommeDesNombresPaires {
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 2; i <=100; i+=2){
            somme += i;
        }
        System.out.println(somme);
    }
}
