package Arreys;

import java.util.Arrays;

public class Zadatak8 {
    public static void main(String[] args) {
        //Ispisati svaki treci element u obrnutom redosledu.
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(niz1));
        svakiTreciElement(niz1);
    }

    public static void svakiTreciElement(int[] niz) {
        for (int i = niz.length - 1; i >= 0; i = i - 3) {
            System.out.print(niz[i]+" ");
        }
    }
}



