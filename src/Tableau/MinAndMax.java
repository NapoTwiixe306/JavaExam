package Tableau;

public class MinAndMax {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] myArray = {2, 8, 1, 5};
        MinAndMax m = new MinAndMax();
        System.out.println("Max : "+m.max(myArray));
        System.out.println("Min : "+m.min(myArray));
    }
}
