package Arreys;

import java.util.Arrays;

public class Zadatak10 {
   // Napisati funkciju koja duplira sve elemente niza, (Dakle prosledjujemo niz, vracamo niz)
    // Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]

        public static void main(String[] args) {

            int [] niz = {1, 2, 3, 4,5, 6, 7};
            System.out.println(Arrays.toString(dupliranNiz(niz)));

        }

        public static int [] dupliranNiz (int [] array){
            int [] niz2 = new int[array.length];
            for (int i = 0; i < array.length; i++){
                niz2[i] = array[i]*2;
            }
            return niz2;
        }
    }


