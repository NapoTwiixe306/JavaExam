package Fonctions;

public class Stars {
    public static void main(String[] args) {
        genererMotif(3);
    }
    public static void genererMotif(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
