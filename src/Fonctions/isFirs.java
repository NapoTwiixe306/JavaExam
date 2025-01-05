package Fonctions;

public class isFirs {
    public static void main(String[] args){
        System.out.println(isFirst(15));
    }

    public static boolean isFirst(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
