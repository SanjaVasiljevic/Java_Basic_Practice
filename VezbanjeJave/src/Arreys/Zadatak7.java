package Arreys;

import java.util.Arrays;

public class Zadatak7 {
  /*  Napisati program
    koji svaki element niza povecava za vrednost pozicije
    na kojoj se element nalazi.Vrednosti i broj elemenata niza su proizvoljni*/

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(saberiIndexIElement(niz)));
    }

    public static int[] saberiIndexIElement(int[] array) {

        int[] niz2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            niz2[i] = array[i] + i;
        }
        return niz2;

    }
}
