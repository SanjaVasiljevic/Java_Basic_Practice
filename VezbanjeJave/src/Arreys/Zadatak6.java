package Arreys;

public class Zadatak6 {
    public static void main(String[] args) {
    /*    Generisati 2 niza. Formirati treći niz od članova prva dva koji se ne ponavljaju,
                ali u trećem niz nesmiju biti članovi koj se ponavljaju.*/

        int niz1[] = {1, 2, 6, 9, 5, 8, 12, 10};
        int niz2[] = {3, 2, 5, 14, 8, 9, 20, 7};

        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    System.out.println("Zajednicki su: " + niz1[i]);
                }
            }
        }
    }
}



