package Arreys;

public class Zadatak11 {
    //41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        public static void main(String[] args) {

            double [] niz = {12.3, 3.0, 22.4, 12.5};
            System.out.println(prosek(niz));
        }

        public static double prosek (double [] niz){
            double suma = 0;
            for (int i = 0; i < niz.length; i++){
                suma = suma + niz[i];
            }
            return suma / niz.length;
        }
    }


