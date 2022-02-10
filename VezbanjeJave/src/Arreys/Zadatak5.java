package Arreys;

public class Zadatak5 {
    // Napisati program koji svaki element niza povecava za vrednost pozicije na kojoj se element nalazi. Vrednosti i broj elemenata niza su proizvoljni
    public static void main(String[] args) {


        int[] niz = {2, 3, 44, 5, -9, 0, -11};
        int najmanjiBr = 0;
        System.out.println(niz.length);

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < najmanjiBr) {
                najmanjiBr = niz[i];
            }
        }
        System.out.println("Najmanji broj niza je: " + najmanjiBr);

    }
}
