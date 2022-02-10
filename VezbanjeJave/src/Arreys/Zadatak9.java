package Arreys;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak9 {
    // Napisati program koji ucitava niz od n celih brojeva i dve metode.
    // Prva metoda vraca proizvod elemenata na neparnim pozicijama,
    // a druga vraca zbir parnih elemenata niza
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Od koliko elemenata je vas niz: ");
        int brojElemenata = sc.nextInt();
        int[] niz = new int[brojElemenata];

        for (int i = 0; i < brojElemenata; i++) {
            System.out.println("Unesite broj u nizu");
            niz[i] = sc.nextInt();
        }
        System.out.println("Vas niz je: " + Arrays.toString(niz));
        System.out.println("Proizvod clanova na neparnim pozicijama je " + proizvodElemenata(niz));
        System.out.println("Zbir clanova na parnim pozicijama je " + zbirElemenata(niz));
    }

    public static int proizvodElemenata(int arr[]) {
        int i = 0;
        int proizvod = 1;
        if (arr[i] % 2 != 0) {
            for (i = 0; i < arr.length; i++) {
                proizvod = proizvod * arr[i];
            }
        }
        return proizvod;
    }
    public static int zbirElemenata(int arr[]){
        int i =0;
        int zbir = 0;
        if (arr[i] % 2 == 0) {
            for (i = 0 ; i < arr.length; i++) {
                zbir = zbir + arr[i] ;
            }
        }
        return zbir;
    }
}
