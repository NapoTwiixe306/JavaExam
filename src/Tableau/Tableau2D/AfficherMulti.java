package Tableau.Tableau2D;

public class AfficherMulti {
    public static void main(String[] args){
        int[][] multi = new int[5][5];

        for(int i = 0; i < multi.length; i++){
            for(int j = 0; j < multi[i].length; j++){
                multi[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < multi.length; i++){
            for (int j = 0; j < multi[i].length; j++){
                System.out.printf("%4d", multi[i][j]);
            }
            System.out.println();
        }
    }
}
