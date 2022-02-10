package Arreys;

import java.util.Arrays;

public class Zadatak4 {
    public static void main(String[] args) {
        //Formirati novi niz od 20 članova od 100 poznatih članova.
        // Obezbjediti da se ne ponavlja izdvajanje istog člana.
        int[] niz = {2, 3, 8, 2, 4, 6, 5, 7, 9, 3, 1, 5, 4, 8};
        int[] noviNiz = new int[5];
        int j = 0;

        for (int i = 0; i < niz.length; i++ ) {
            if (proveraDupliranja(niz[i], noviNiz)){
                System.out.println("taj broj sadrzi vec");
            }else {
                if  (j<4)break;
                noviNiz[j++] = niz[i];
            }
        }
        System.out.println(Arrays.toString(noviNiz));
    }

    public static boolean proveraDupliranja(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}

