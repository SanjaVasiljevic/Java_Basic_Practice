package Arreys;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        // Korisnik ucitava niz od n elemenata niza, kao i neki broj br.
// Program ispisuje elemente niza deljive brojem br.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata ima vas niz: ");
        int brojElemenata = sc.nextInt();
        int[] niz = new int[brojElemenata];
        int[] niz2 = {};

        System.out.println("Unesite neki broj: ");
        int broj = sc.nextInt();
        int i = 0;
        for (i = 0; i < niz.length; i++) {
            System.out.println("Unesite broj u nizu");
            niz[i] = sc.nextInt();

            if (niz[i] % broj == 0) {
                System.out.println("Broj je deljiv sa unetim brojem");
                System.out.println(niz[i]);
            } else {
                System.out.println("Broj nje deljiv sa datim brojem.");
            }
        }
    }

    }

